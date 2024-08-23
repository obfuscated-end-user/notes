using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class Login : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}
    DataAccess myData = new DataAccess();
    protected void loginBtn_Click(object sender, EventArgs e) {
        try {
            if (loginUsernameTxtbox.Text == "admin" && loginPasswordTxtbox.Text == "admin") {
                System.Diagnostics.Debug.WriteLine("admin");
                Response.Redirect("AddNewProducts.aspx");
            } else if (myData.login(loginUsernameTxtbox.Text, loginPasswordTxtbox.Text)) {               
                System.Diagnostics.Debug.WriteLine("user exists that is not admin");
                Session["username"] = loginUsernameTxtbox.Text;
                Response.Redirect("ProfileManager.aspx");
            }
        } catch (Exception ex) {
            System.Diagnostics.Debug.WriteLine("user does not exist");
            System.Diagnostics.Debug.WriteLine(ex.ToString());
        }
    }
}