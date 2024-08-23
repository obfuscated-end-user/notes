using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace DataHelper {
    public class DataAccess {
        static string connStr = ConfigurationManager.ConnectionStrings["Profiles"].ConnectionString;
        SqlConnection conn = new SqlConnection(connStr);

        // LOGIN
        public bool login(string username, string password) {
            bool loginSuccess = false;
            try {
                conn.Open();
                SqlCommand loginCmd = new SqlCommand("Login", conn);
                loginCmd.CommandType = CommandType.StoredProcedure;
                loginCmd.Parameters.Add("@Username", SqlDbType.NVarChar).Value = username;
                loginCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = password;
                SqlDataAdapter sda = new SqlDataAdapter(loginCmd);
                DataTable dt = new DataTable();
                sda.Fill(dt);
                int i = loginCmd.ExecuteNonQuery();
                conn.Close();

                if (dt.Rows.Count > 0)
                    loginSuccess = true;
                else 
                    loginSuccess = false;
            } catch (Exception ex) {}
            return loginSuccess;
        }

        // REGISTER
        public void register(string username, string password) {
            conn.Open();
            SqlCommand registerCmd = new SqlCommand("Register", conn);
            registerCmd.CommandType = CommandType.StoredProcedure;
            registerCmd.Parameters.Add("@Username", SqlDbType.NVarChar).Value = username;
            registerCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = password;
            registerCmd.ExecuteNonQuery();
            conn.Close();
        }
        
        // CHANGE PASSWORD
        public void changePassword(string username, string password)
        {
            conn.Open();
            SqlCommand updatePassCmd = new SqlCommand("UpdatePassword", conn);
            updatePassCmd.CommandType = CommandType.StoredProcedure;
            updatePassCmd.Parameters.Add("@Username", SqlDbType.NVarChar).Value = username;
            updatePassCmd.Parameters.Add("@Password", SqlDbType.NVarChar).Value = password;
            updatePassCmd.ExecuteNonQuery();
            conn.Close();
        }

        // SHOW PRODUCT DATA
        public DataTable displayProducts() {
            conn.Open();
            SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayProducts", conn);
            dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
            DataTable datatable = new DataTable();
            dataAdapter.Fill(datatable);
            conn.Close();
            return datatable;
        }

        // SHOW TRANSACTION DATA
        public DataTable displayTransactions() {
            conn.Open();
            SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayTransactions", conn);
            dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
            DataTable datatable = new DataTable();
            dataAdapter.Fill(datatable);
            conn.Close();
            return datatable;
        }

        // SHOW PROFILE DATA
        public DataTable displayProfiles() {
            conn.Open();
            SqlDataAdapter dataAdapter = new SqlDataAdapter("DisplayProfiles", conn);
            dataAdapter.SelectCommand.CommandType = CommandType.StoredProcedure;
            DataTable datatable = new DataTable();
            dataAdapter.Fill(datatable);
            conn.Close();
            return datatable;
        }

        // ADD PRODUCT
        public void addProduct(int id, string productID, string productName, float price, int stocks, double srp) {
            conn.Open();
            SqlCommand addProductCmd = new SqlCommand("AddProduct", conn);
            addProductCmd.CommandType = CommandType.StoredProcedure;
            addProductCmd.Parameters.Add("@Id", SqlDbType.Int).Value = id;
            addProductCmd.Parameters.Add("@ProductId", SqlDbType.NVarChar).Value = productID;
            addProductCmd.Parameters.Add("@ProductName", SqlDbType.NVarChar).Value = productName;
            addProductCmd.Parameters.Add("@Price", SqlDbType.Float).Value = price;
            addProductCmd.Parameters.Add("@Stocks", SqlDbType.Int).Value = stocks;
            addProductCmd.Parameters.Add("@SRP", SqlDbType.Float).Value = srp;
            addProductCmd.ExecuteNonQuery();
            conn.Close();
        }

        // ADD TO TRANSACTIONS
        public void addTransaction(int transactionID, string productName, int quantity, float totalAmountPurchase, string date) {
            conn.Open();
            SqlCommand addTransactionCmd = new SqlCommand("AddTransaction", conn);
            addTransactionCmd.CommandType = CommandType.StoredProcedure;
            addTransactionCmd.Parameters.Add("@TransactionID", SqlDbType.NVarChar).Value = transactionID;
            addTransactionCmd.Parameters.Add("@ProductName", SqlDbType.NVarChar).Value = productName;
            addTransactionCmd.Parameters.Add("@Quantity", SqlDbType.Int).Value = quantity;
            addTransactionCmd.Parameters.Add("@TotalAmountPurchase", SqlDbType.Float).Value = totalAmountPurchase;
            addTransactionCmd.Parameters.Add("@TransactionDate", SqlDbType.NVarChar).Value = date;
            addTransactionCmd.ExecuteNonQuery();
            conn.Close();
        }

        // RESET TRANSACTIONS
        public void resetTransactions() {
            conn.Open();
            SqlCommand resetTransactionCmd = new SqlCommand("ResetTransactions", conn);
            resetTransactionCmd.CommandType = CommandType.StoredProcedure;
            resetTransactionCmd.ExecuteNonQuery();
            conn.Close();
        }
        // TOTAL AMOUNT
        public double totalAmount(double SRP, int quantity) {
            return SRP * quantity;
        }

        // VAT
        public double vat(double totalAmount) {
            return totalAmount * 0.1;
        }

        // TOTAL AMOUNT PURCHASE
        public double totalAmountPurchase(double totalAmount, string membership) {
            totalAmount += vat(totalAmount);
            double discount = 0;
            switch (membership) {
                case "SILVER": discount = 0.05; break;
                case "GOLD": discount = 0.1; break;
                case "PLATINUM": discount = 0.15; break;
            }
            if (totalAmount >= 10000)
                return totalAmount += totalAmount * discount;
            else
                return totalAmount;
        }

        public double applyDiscount(double totalAmount, string membership) {
            double discount = 0;
            switch (membership) {
                case "SILVER": discount = 0.05; break;
                case "GOLD":   discount = 0.1; break;
                case "PLATINUM": discount = 0.15; break;
            }
            if (totalAmount >= 10000)
                return totalAmount - (totalAmount * discount);
            else
                return totalAmount;
        }
    }
}