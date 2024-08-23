using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Calculator : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void btnSubmit_Click(object sender, EventArgs e)
    {
        Session["firstName"] = txtFirstName.Text;
        Session["lastName"] = txtLastName.Text;
        Session["customerType"] = dropdownCustomerType.SelectedItem;
        Session["carType"] = dropdownCarType.SelectedItem;
        Session["yearsToPay"] = dropdownYearsToPay.SelectedItem;

        // for the radio buttons
        if (radioBtn20.Checked)
            Session["downPayment"] = "0.2";
        else if (radioBtn25.Checked)
            Session["downPayment"] = "0.25";
        else if (radioBtn30.Checked)
            Session["downPayment"] = "0.3";
        else if (radioBtn35.Checked)
            Session["downPayment"] = "0.35";
        else if (radioBtn40.Checked)
            Session["downPayment"] = "0.4";
        else if (radioBtn45.Checked)
            Session["downPayment"] = "0.45";
        else if (radioBtn50.Checked)
            Session["downPayment"] = "0.5";
        Response.Redirect("Output.aspx");
    }
}