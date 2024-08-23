using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataHelper2
{
    public class DataAccess
    {
        public static string updatePrice(string product)
        {
            float price = 0F;
            switch (product)
            {
                case "Laptop": price = 35500F; break;
                case "Desktop": price = 27500F; break;
                case "Printer (dot matrix)": price = 5500F; break;
                case "Printer (ink jet)": price = 4500F; break;
            }
            return "₱" + price.ToString("#,##0.00");
        }

        public static string appliedDiscount(string membershipType, string product, int quantity)
        {
            float discount = 0F;
            switch (membershipType)
            {
                case "SILVER": discount = 0.12F; break;
                case "GOLD": discount = 0.15F; break;
                case "PLATINUM": discount = 0.2F; break;
            }

            float price = 0F;
            switch (product)
            {
                case "Laptop": price = 35500F; break;
                case "Desktop": price = 27500F; break;
                case "Printer (dot matrix)": price = 5500F; break;
                case "Printer (ink jet)": price = 4500F; break;
            }

            if (quantity < 1)
                quantity = 1;

            if (quantity > 2)
                return "₱" + ((price * quantity) - ((price * quantity) * discount)).ToString("#,##0.00");
            else
                return "₱" + (price * quantity).ToString("#,##0.00");
        }

        public static string totalAmountPurchase(string priceString, int quantity, string membershipType)
        {
            char[] trim = { '₱', ',' };
            float priceFloat = float.Parse(priceString.Trim(trim));
            float discount = 0F;
            switch (membershipType)
            {
                case "SILVER": discount = 0.12F; break;
                case "GOLD": discount = 0.15F; break;
                case "PLATINUM": discount = 0.2F; break;
            }

            if (quantity > 2)
                return "₱" + ((priceFloat * quantity) - ((priceFloat * quantity) * discount)).ToString("#,##0.00");
            else
                return "₱" + (priceFloat * quantity).ToString("#,##0.00");
        }

        public static string subTotal(string totalAmountString, string subTotalString)
        {
            char[] trim = { '₱', ',' };
            float totalAmountFloat = float.Parse(totalAmountString.Trim(trim));
            float subTotalFloat = float.Parse(subTotalString.Trim(trim));
            subTotalFloat += totalAmountFloat;
            return "₱" + subTotalFloat.ToString("#,##0.00");
        }

        public static string appliedDiscount(string membershipType)
        {
            string appliedDiscountPercentage = "";
            switch (membershipType)
            {
                case "SILVER": appliedDiscountPercentage = "12%"; break;
                case "GOLD": appliedDiscountPercentage = "15%"; break;
                case "PLATINUM": appliedDiscountPercentage = "20%"; break;
            }
            return appliedDiscountPercentage;
        }
    }
}
