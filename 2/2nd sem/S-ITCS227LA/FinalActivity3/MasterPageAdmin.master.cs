using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class MasterPageAdmin : System.Web.UI.MasterPage
{
    protected void Page_Load(object sender, EventArgs e) { }
    protected void masterPageUserLogoutBtn_Click(object sender, EventArgs e)
    {
        Response.Redirect("Home.aspx");
    }
    protected void DataList1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }
    protected void Timer1_Tick(object sender, EventArgs e)
    {
            Random ran = new Random();
            int i = ran.Next(6, 16);
            Image2.ImageUrl = "~/Images/" + i.ToString() + ".jpg";
        }
    }
