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

        public void registerStudent(string studentNumber, string studentName, string studentPassword, string studentCYS, string studentGender) {
            conn.Open();
            SqlCommand registerCmd = new SqlCommand("RegisterStudent", conn);
            registerCmd.CommandType = CommandType.StoredProcedure;
            try {
                registerCmd.Parameters.Add("@StudentNumber", SqlDbType.NVarChar).Value = studentNumber;
                registerCmd.Parameters.Add("@StudentName", SqlDbType.NVarChar).Value = studentName;
                registerCmd.Parameters.Add("@CourseYrSection", SqlDbType.NVarChar).Value = studentCYS;
                registerCmd.Parameters.Add("@Gender", SqlDbType.NVarChar).Value = studentGender;
                registerCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = studentPassword;
                registerCmd.ExecuteNonQuery();
            }
            catch (Exception e) {}
            conn.Close();
        }
    }
}