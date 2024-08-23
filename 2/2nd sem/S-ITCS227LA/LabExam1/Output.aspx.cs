using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class Output : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {
        labelFirstName.Text = Session["firstName"].ToString();
        labelLastName.Text = Session["LastName"].ToString();
        labelEmail.Text = Session["emailLogin"].ToString();
        labelCustomerType.Text = Session["customerType"].ToString();

        char[] trim = { 'F', '₱', ',' };
        string carType = Session["carType"].ToString();
        float TCP = DataAccess.carType(carType);

        // display the results
        labelDownPayment.Text = DataAccess.downPayment(float.Parse(Session["downPayment"].ToString()), TCP);
        labelTotalCashOut.Text = DataAccess.totalCashOut(float.Parse(labelDownPayment.Text.ToString().Trim(trim)), DataAccess.discount(Session["customerType"].ToString(), TCP));
        labelMonthlyAmortization.Text = DataAccess.monthlyAmortization(TCP, float.Parse(labelTotalCashOut.Text.ToString().Trim(trim)), int.Parse(Session["yearsToPay"].ToString()));

        // miscellaneous section
        float chattelMortgage = 35000;
        float actsOfGod = 30000;
        float LTO = 8500;
        labelMiscellaneous.Text = DataAccess.miscellaneous(chattelMortgage, actsOfGod, LTO, int.Parse(Session["yearsToPay"].ToString()));

        // total price
        labelTotalPrice.Text = "₱" + (float.Parse(labelMiscellaneous.Text.ToString().Trim(trim)) + TCP).ToString("#,##0.00");
    }
}