using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Login : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void btnLogin_Click(object sender, EventArgs e) {
        Session["emailLogin"] = txtEmailLogin.Text;
        loginAccount(txtEmailLogin.Text, txtPasswordLogin.Text);
    }

    public void loginAccount(string email, string password) {
        string connectionString = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=""C:\Users\HP\Documents\Visual Studio 2013\WebSites\LabExam1\App_Data\AccountDatabase.mdf"";Integrated Security=True";
        SqlConnection connection = new SqlConnection(connectionString);
        connection.Open();
        SqlCommand loginCommand = new SqlCommand("LoginAccount", connection);
        loginCommand.CommandType = CommandType.StoredProcedure;

        try {
            loginCommand.Parameters.Add("@AccountEmail", SqlDbType.NVarChar).Value = email;
            loginCommand.Parameters.Add("@AccountPassword", SqlDbType.NVarChar).Value = password;
            int status = Convert.ToInt16(loginCommand.ExecuteScalar());
            if (status == 1)
                Response.Redirect("Calculator.aspx");
            else {
                labelLoginVerification.Visible = true;
                labelLoginVerification.Text = "Wrong password, or account does not exist.";
                System.Diagnostics.Debug.WriteLine("wrong email or password, redirect back to login page");
            }
        } catch (Exception ex) {}
    }
}