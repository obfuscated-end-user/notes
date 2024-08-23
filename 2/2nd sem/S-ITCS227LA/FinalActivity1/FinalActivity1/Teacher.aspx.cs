using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

public partial class Teacher : System.Web.UI.Page {
    protected void Page_Load(object sender, EventArgs e) {}

    protected void tchPageSearchAndComputeBtn_Click(object sender, EventArgs e) {
        searchStudent(tchPageStdID.Text);
    }

    static string connStr = ConfigurationManager.ConnectionStrings["ConnectionString"].ConnectionString;
    SqlConnection conn = new SqlConnection(connStr);

    public void searchStudent(string studentID) {
        conn.Open();
        SqlCommand searchCmd = new SqlCommand("SearchRecord", conn);
        searchCmd.CommandType = CommandType.StoredProcedure;
        searchCmd.Parameters.Add("@StudentID", SqlDbType.NVarChar).Value = studentID;
        SqlDataReader dr = searchCmd.ExecuteReader();
        while (dr.Read()) {
            tchPageNameLabel.Text = dr.GetString(0);
            tchPagePrelimLabel.Text = dr.GetDecimal(1).ToString();
            tchPageMidtermLabel.Text = dr.GetDecimal(2).ToString();
            tchPageFinalLabel.Text = dr.GetDecimal(3).ToString();
        }
        conn.Close();

        double prelim = Convert.ToDouble(tchPagePrelimLabel.Text);
        double midterm = Convert.ToDouble(tchPageMidtermLabel.Text);
        double final = Convert.ToDouble(tchPageFinalLabel.Text);
        double average = (prelim + midterm + final) / 3;
        tchPageAverageLabel.Text = average.ToString("n2");
    }
}