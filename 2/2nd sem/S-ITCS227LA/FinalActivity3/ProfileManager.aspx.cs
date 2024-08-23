using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class ProfileManager : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {
        loggedInUserLabel.Text = Session["username"].ToString();
    }
    DataAccess myData = new DataAccess();
    protected void Button1_Click(object sender, EventArgs e) {
        try {
            myData.changePassword(loggedInUserLabel.Text, profMgrPasswordTxtbox.Text);
            profMgrPasswordVerifyLabel.Visible = true;
            profMgrPasswordVerifyLabel.Text = "Password successfully changed.";
        } catch (Exception ex) {}   
    }
}