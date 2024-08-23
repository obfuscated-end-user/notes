using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

public partial class Registration : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void stdRegisterBtn_Click(object sender, EventArgs e) {
        registerStudent(studentRegNumTxtbox.Text, studentRegNameTxtbox.Text, studentRegPassTxtbox.Text, studentRegCYS.Text, studentRegGender.SelectedValue);
    }

    static string connStr = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
    SqlConnection conn = new SqlConnection(connStr);

    public void registerStudent(string studentNumber, string studentName, string studentPassword, string studentCYS, string studentGender) {
        conn.Open();
        SqlCommand registerCmd = new SqlCommand("RegisterStudent", conn);
        registerCmd.CommandType = CommandType.StoredProcedure;
        try {
            registerCmd.Parameters.Add("@StudentNumber", SqlDbType.NVarChar).Value = studentNumber;
            registerCmd.Parameters.Add("@StudentName", SqlDbType.NVarChar).Value = studentName;
            registerCmd.Parameters.Add("@CourseYrSection", SqlDbType.NVarChar).Value = studentCYS;
            registerCmd.Parameters.Add("@Gender", SqlDbType.NVarChar).Value = studentGender;
            registerCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = studentPassword;
            registerCmd.ExecuteNonQuery();
            studentRegLabel.Text = "Student registered successfully.";
        } catch (Exception e) {
            studentRegLabel.Text = e.ToString();
        }
        conn.Close();
    }
}