using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Registration : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e) {
        
    }

    protected void btnSubmit_Click(object sender, EventArgs e) {
        Session["firstName"] = txtFirstName.Text;
        Session["lastName"] = txtLastName.Text;
        Session["birthday"] = txtBDay.Text;
        Session["membershipType"] = dropdownMembership.SelectedItem;
        Response.Redirect("Transaction.aspx");
    }
}