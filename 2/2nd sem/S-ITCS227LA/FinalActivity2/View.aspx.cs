using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

public partial class View : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {
        if (!IsPostBack) {
            GridView1.DataSource = displayGrades();
            GridView1.DataBind();
        }
    }

    static string connStr = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
    SqlConnection conn = new SqlConnection(connStr);

    public DataSet displayGrades() {
        conn.Open();
        SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayGrades", conn);
        dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
        DataSet dataset = new DataSet();
        dataAdapter.Fill(dataset);
        conn.Close();
        return dataset;
    }
}