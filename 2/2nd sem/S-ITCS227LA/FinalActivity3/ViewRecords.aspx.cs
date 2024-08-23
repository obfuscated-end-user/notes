using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class ViewRecords : System.Web.UI.Page {
    DataAccess data = new DataAccess();
    protected void Page_Load(object sender, EventArgs e) {
        GridView1.DataSource = data.displayProfiles();
        GridView1.DataBind();
        GridView2.DataSource = data.displayProducts();
        GridView2.DataBind();
    }
}