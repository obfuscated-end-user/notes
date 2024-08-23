using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;
using System.Data.SqlClient;

namespace DataHelper {
    public class DataAccess {
        // used for the car type, used for determining the value of the TCP
        public static float carType(string carType) {
            float TCP = 0;
            switch (carType) {
                case "SUV":     TCP = 1500000;  break;
                case "Van":     TCP = 890000;   break;
                case "Sedan":   TCP = 680000;   break;
                default:        TCP = 0;        break;
            }
            return TCP;
        }

        // used for modifying the TCP based on the discount
        public static float discount(string type, float TCP) {
            float membershipDiscount = 0;
            switch (type) {
                case "Platinum":    membershipDiscount  = 0.07F;    break;
                case "Silver":      membershipDiscount  = 0.044F;   break;
                case "Gold":        membershipDiscount  = 0.043F;   break;
                default:            membershipDiscount  = 0;        break;
            }
            return TCP * membershipDiscount;
        }

        public static string downPayment(float percentage, float TCP) {
            return "₱" + (percentage * TCP).ToString("#,##0.00");
        }

        public static string totalCashOut(float downPayment, float discount) {
            return "₱" + (downPayment - discount).ToString("#,##0.00");
        }

        public static string monthlyAmortization(float TCP, float TCO, int numberOfYears) {
            return "₱" + ((TCP - TCO) / (numberOfYears * 12)).ToString("#,##0.00");
        }

        public static string miscellaneous(float mortgage, float actsOfGod, float LTO, int numberOfYears) {
            if (numberOfYears == 5)
                return "₱0.00";
            else
                return "₱" + (mortgage + actsOfGod + LTO).ToString("#,##0.00");
        }
    }
}