using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class TeacherLogin : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void techLoginBtn_Click(object sender, EventArgs e) {
        if (tchLogUsername.Text == "admin" && tchLogPassword.Text == "admin")
            Response.Redirect("Teacher.aspx");
        else
            tchLogLabel.Text = "Invalid username or password.";
    }
}