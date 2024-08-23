using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using DataHelper;

public partial class MasterPageUser : System.Web.UI.MasterPage {
    protected void Page_Load(object sender, EventArgs e) {}
    DataAccess data = new DataAccess();
    protected void masterPageUserLogoutBtn_Click(object sender, EventArgs e) {
        Session["username"] = "";
        data.resetTransactions();
        Response.Redirect("Home.aspx");
    }
    protected void Timer1_Tick(object sender, EventArgs e)
    {
        Random ran = new Random();
        int i = ran.Next(6, 16);
        Image2.ImageUrl = "~/Images/" + i.ToString() + ".jpg";
        }
    }

