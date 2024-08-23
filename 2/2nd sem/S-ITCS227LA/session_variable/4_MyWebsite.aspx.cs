using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class MyWebsite : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        lblStudentName.Text = Session["studentName"].ToString();
        lblStudentID.Text = Session["studentID"].ToString();
        lblStudentCourseYrSec.Text = Session["studentCourseYrSec"].ToString();
    }
}