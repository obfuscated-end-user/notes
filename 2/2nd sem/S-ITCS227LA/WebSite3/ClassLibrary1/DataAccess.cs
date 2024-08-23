using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace DataHelper2
{
    public class DataAccess
    {
        static string conStr = @"Data Source=(LocalDB)\v11.0;AttachDbFilename=""C:\Users\HP\Documents\Visual Studio 2013\WebSites\WebSite3\App_Data\MasterFile.mdf"";Integrated Security=True";
        SqlConnection Connection = new SqlConnection(conStr);

        public void saveNewRecord(string customerID, string firstName, string lastName, string email, string password, string customerType)
        {
            Connection.Open();
            SqlCommand saveCmd = new SqlCommand("AddNewRecord", Connection);
            saveCmd.CommandType = CommandType.StoredProcedure;
            saveCmd.Parameters.Add("@CustomerID", SqlDbType.NVarChar).Value = customerID;
            saveCmd.Parameters.Add("@FirstName", SqlDbType.NVarChar).Value = firstName;
            saveCmd.Parameters.Add("@LastName", SqlDbType.NVarChar).Value = lastName;
            saveCmd.Parameters.Add("@Email", SqlDbType.NVarChar).Value = email;
            saveCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = password;
            saveCmd.Parameters.Add("@CustomerType", SqlDbType.NVarChar).Value = customerType;
            saveCmd.ExecuteNonQuery();
            Connection.Close();
        }

        public DataSet displayRecords()
        {
            SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayCustomerRecords", Connection);
            dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
            DataSet dataset = new DataSet();
            dataAdapter.Fill(dataset);
            return dataset;
        }
    }
}
