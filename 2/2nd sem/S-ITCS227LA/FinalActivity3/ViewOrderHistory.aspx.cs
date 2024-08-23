using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class ViewOrderHistory : System.Web.UI.Page {
    DataAccess data = new DataAccess();
    protected void Page_Load(object sender, EventArgs e) {
        orderHistoryUsernameLabel.Text = Session["username"].ToString();
        GridView1.DataSource = data.displayTransactions();
        GridView1.DataBind();
    }
}