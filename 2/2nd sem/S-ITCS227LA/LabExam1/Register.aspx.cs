using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

public partial class Register : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void btnRegister_Click(object sender, EventArgs e) {
        registerAccountEmail(txtEmailRegister.Text, txtPasswordRegister.Text);
    }
    
    public void registerAccountEmail(string email, string password) {
        string connectionString = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=""C:\Users\HP\Documents\Visual Studio 2013\WebSites\LabExam1\App_Data\AccountDatabase.mdf"";Integrated Security=True";
        SqlConnection connection = new SqlConnection(connectionString);
        connection.Open();
        SqlCommand registerCommand = new SqlCommand("RegisterAccount", connection);
        registerCommand.CommandType = CommandType.StoredProcedure;

        try {
            registerCommand.Parameters.Add("@AccountEmail", SqlDbType.NVarChar).Value = email;
            registerCommand.Parameters.Add("@AccountPassword", SqlDbType.NVarChar).Value = password;
            registerCommand.ExecuteNonQuery();
            Response.Redirect("Login.aspx");
            System.Diagnostics.Debug.WriteLine("email does not exist, so it is registered");
        }
        catch (Exception ex) {
            labelIndicatorRegister.Visible = true;
            labelIndicatorRegister.Text = "Email is already registered.";
            System.Diagnostics.Debug.WriteLine("email exists");
        }
    }
}