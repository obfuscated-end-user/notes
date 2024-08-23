using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class AddNewProdcuts : System.Web.UI.Page
{
    DataAccess data = new DataAccess();
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            GridView1.DataSource = data.displayProducts();
            GridView1.DataBind();
        }
    }
    protected void addNewProductsBtn_Click(object sender, EventArgs e)
    {
        try
        {
            int transactionID = int.Parse(incrementLabel.Text);
            incrementLabel.Text = (int.Parse(incrementLabel.Text) + 1).ToString();
            double srp = double.Parse(addNewPriceTxtBox.Text) + (double.Parse(addNewPriceTxtBox.Text) * 0.15);
            data.addProduct(transactionID, addNewProductIDTxtBox.Text, addNewProductNameTxtBox.Text, float.Parse(addNewPriceTxtBox.Text), int.Parse(addNewStocksTxtBox.Text), srp);
            GridView1.DataSource = data.displayProducts();
            GridView1.DataBind();
        }
        catch (Exception ex) { }
    }
}