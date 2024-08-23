using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class Registration : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    DataAccess myData = new DataAccess();
    protected void btnSubmit_Click(object sender, EventArgs e)
    {
        myData.saveNewRecord(txtCustomerID.Text, txtFirstName.Text, txtLastName.Text, txtEmail.Text, txtPass.Text, dropdownCustomerType.SelectedValue);
    }
}