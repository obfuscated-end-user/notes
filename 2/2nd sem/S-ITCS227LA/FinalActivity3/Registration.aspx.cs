using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using DataHelper;

public partial class Registration : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}
    DataAccess myData = new DataAccess();
    protected void registerBtn_Click(object sender, EventArgs e) {
        try {
            myData.register(registerUsernameTxtbox.Text, registerPasswordTxtbox.Text);
            registerAccLabel.Visible = true;
            registerAccLabel.Text = "Account registration successful.";
        } catch (Exception ex) {
            registerAccLabel.Visible = true;
            registerAccLabel.Text = "Account is already registered.";
        }
    }
}