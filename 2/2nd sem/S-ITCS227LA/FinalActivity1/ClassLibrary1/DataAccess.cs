using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace DataHelper {
    public class DataAccess {
        static string connStr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=C:\Users\HP\Documents\Visual Studio 2013\WebSites\FinalActivity1\App_Data\MasterFile.mdf;Integrated Security=True";
        SqlConnection conn = new SqlConnection(connStr);

        public void registerStudent(string studentID, string studentName) {
            conn.Open();
            SqlCommand registerCmd = new SqlCommand("RegisterStudent", conn);
            registerCmd.CommandType = CommandType.StoredProcedure;
            registerCmd.Parameters.Add("@StudentID", SqlDbType.NVarChar).Value = studentID;
            registerCmd.Parameters.Add("@StudentName", SqlDbType.NVarChar).Value = studentName;
            registerCmd.ExecuteNonQuery();
            conn.Close();
        }
        
        public void searchStudent(string studentID) {
            conn.Open();
            SqlCommand searchCmd = new SqlCommand("SearchRecord", conn);
            searchCmd.CommandType = CommandType.StoredProcedure;
            searchCmd.Parameters.Add("@StudentID", SqlDbType.NVarChar).Value = studentID;
            searchCmd.ExecuteNonQuery();
            conn.Close();
        }

        public void filterDatabase(string filter) {
            conn.Open();
            SqlCommand filterCmd = new SqlCommand("FilterDatabase", conn);
            filterCmd.CommandType = CommandType.StoredProcedure;
            filterCmd.Parameters.Add("@Remark", SqlDbType.NVarChar).Value = filter;
            filterCmd.ExecuteNonQuery();
            conn.Close();
        }
    }
}