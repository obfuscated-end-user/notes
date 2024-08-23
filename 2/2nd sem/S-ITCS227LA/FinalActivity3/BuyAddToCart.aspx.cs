using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class BuyAddToCart : System.Web.UI.Page {
    DataAccess data = new DataAccess();
    protected void Page_Load(object sender, EventArgs e) {
        if (!IsPostBack) {
            GridView1.DataSource = data.displayProducts();
            GridView1.DataBind();
        }
    }
    protected void GridView1_SelectedIndexChanged(object sender, EventArgs e) {
        GridViewRow row = GridView1.SelectedRow;
        string productName = row.Cells[2].Text;
        int price = int.Parse(row.Cells[3].Text);
        int stocks = int.Parse(row.Cells[4].Text);
        double srp = double.Parse(row.Cells[5].Text);
        selectedProductLabel.Text = productName;
        productPriceLabel.Text = price.ToString();
        productSrpLabel.Text = srp.ToString();
    }
    protected void addToCartBtn_Click(object sender, EventArgs e) {
        try {
            if (int.Parse(quantityTxtbox.Text) <= 0) {
                quantityTxtbox.Text = "0";
                addToCartQuantityLabel.Visible = true;
            } else {
                GridViewRow row = GridView1.SelectedRow;
                int cell = int.Parse(row.Cells[4].Text);
                int quantity = int.Parse(quantityTxtbox.Text);
                double srp = double.Parse(row.Cells[5].Text);
                if (cell < quantity || quantity > cell) {
                    addToCartLabel.Visible = true;
                    addToCartLabel.Text = "An error occurred.";
                } else {
                    int transactionID = int.Parse(incrementLabel.Text);
                    incrementLabel.Text = (int.Parse(incrementLabel.Text) + 1).ToString();
                    row.Cells[4].Text = (int.Parse(row.Cells[4].Text) - int.Parse(quantityTxtbox.Text)).ToString();
                    double totalAmount = data.totalAmount(srp, int.Parse(quantityTxtbox.Text));
                    productTapLabel.Text = data.totalAmountPurchase(totalAmount, membershipTypeDropdown.SelectedItem.ToString()).ToString();
                    addToCartLabel.Visible = true;
                    addToCartLabel.Text = "Successfully added item to cart.";
                    data.addTransaction(transactionID, row.Cells[2].Text, quantity, float.Parse(productTapLabel.Text), DateTime.Now.ToString());
                }
            }
        } catch (Exception ex) {}
    }
}