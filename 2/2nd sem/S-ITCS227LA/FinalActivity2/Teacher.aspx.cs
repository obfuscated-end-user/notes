using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

public partial class Teacher : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e) {}

    static string connStr = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
    SqlConnection conn = new SqlConnection(connStr);
    protected void resetBtn_Click(object sender, EventArgs e) {
        conn.Open();
        SqlCommand updatePassword = new SqlCommand("UpdatePassword", conn);
        updatePassword.CommandType = CommandType.StoredProcedure;
        try {
            updatePassword.Parameters.Add("@Password", SqlDbType.NVarChar).Value = adminPasswordTextbox.Text;
            updatePassword.ExecuteNonQuery();
            passwordIndicatorLabel.Text = "Student passwords updated successfully.";
        }
        catch (Exception exception) {}
        conn.Close();
    }
}