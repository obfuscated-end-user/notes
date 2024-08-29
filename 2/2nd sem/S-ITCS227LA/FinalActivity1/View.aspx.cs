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
    string remark = "";
    protected void Page_Load(object sender, EventArgs e) {
        if (!IsPostBack) {
            GridView1.DataSource = displayGrades();
            GridView1.DataBind();
        }
    }

    protected void RadioBtnListFilterTable_SelectedIndexChanged(object sender, EventArgs e) {
        if (RadioBtnListFilterTable.SelectedValue == "All") {
            GridView1.DataSource = displayGrades();
            GridView1.DataBind();
        } else if (RadioBtnListFilterTable.SelectedValue == "Passed") {
            remark = "PASSED";
            GridView1.DataSource = displayGradesRemarks(remark);
            GridView1.DataBind();
        } else {
            remark = "FAILED";
            GridView1.DataSource = displayGradesRemarks(remark);
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

    public DataSet displayGradesRemarks(string remark) {
        conn.Open();
        SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayGradesRemarks", conn);
        dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
        dataAdapter.SelectCommand.Parameters.Add("@Remark", SqlDbType.NVarChar).Value = remark;
        DataSet dataset = new DataSet();
        dataAdapter.Fill(dataset);
        conn.Close();
        return dataset;
    }
}