using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper2;

public partial class Transaction : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {
        string initials = Session["firstName"].ToString()[0].ToString() + Session["lastName"].ToString()[0].ToString();
        string idNumber = (Session["birthday"].ToString()).Replace("-", "").Remove(0, 3);

        labelMemberID.Text = initials + idNumber;
        labelMemberName.Text = Session["firstName"].ToString() + " " + Session["lastName"].ToString();
        labelAppliedDiscount.Text = DataAccess.appliedDiscount(Session["membershipType"].ToString());

        if (!IsPostBack) {
            labelPrice.Text = DataAccess.appliedDiscount(
                                            Session["membershipType"].ToString(),
                                            dropdownSelectProduct.SelectedItem.ToString(),
                                            int.Parse(txtQuantity.Text)
                                        );
        }
    }
    protected void dropdownSelectProduct_SelectedIndexChanged(object sender, EventArgs e) {
        labelPrice.Text = DataAccess.updatePrice(dropdownSelectProduct.SelectedItem.ToString());
    }

    protected void txtQuantity_TextChanged(object sender, EventArgs e) {
        if (int.Parse(txtQuantity.Text) < 1)
            txtQuantity.Text = "1";
    }
    protected void btnAddToCart_Click(object sender, EventArgs e) {
        labelTotalAmountPurchase.Text = DataAccess.totalAmountPurchase(
                labelPrice.Text,
                int.Parse(txtQuantity.Text),
                Session["membershipType"].ToString()
            );
        labelSubTotal.Text = DataAccess.subTotal(
                labelTotalAmountPurchase.Text,
                labelSubTotal.Text
            );
    }
}