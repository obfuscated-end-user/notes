using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Login : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void loginBtn_Click(object sender, EventArgs e) {
        bool user = loginUsernameTxtbox.Text == "admin";
        bool pass = loginPasswordTxtbox.Text == "admin";
        try {
            if (user && pass)
                Response.Redirect("Teacher.aspx");
            else
                loginLabel.Text = "Invalid username or password.";
        }
        catch (Exception exception) {
            loginLabel.Text = "Invalid username or password.";
        }
    }
}