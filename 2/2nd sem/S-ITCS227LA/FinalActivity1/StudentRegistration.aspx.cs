using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

public partial class StudentRegistration : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void stdRegisterBtn_Click(object sender, EventArgs e) {
        registerStudent(stdRegStdID.Text, stdRegName.Text);
    }

    static string connStr = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
    SqlConnection conn = new SqlConnection(connStr);

    public void registerStudent(string studentID, string studentName) {
        conn.Open();
        SqlCommand registerCmd = new SqlCommand("RegisterStudent", conn);
        registerCmd.CommandType = CommandType.StoredProcedure;
        try {
            registerCmd.Parameters.Add("@StudentID", SqlDbType.NVarChar).Value = studentID;
            registerCmd.Parameters.Add("@StudentName", SqlDbType.NVarChar).Value = studentName;
            registerCmd.ExecuteNonQuery();
            stdRegLabel.Text = "Student ID registered successfully.";
        } catch (Exception e) {
            stdRegLabel.Text = "Student ID is already registered.";
        }
        conn.Close();
    }
}