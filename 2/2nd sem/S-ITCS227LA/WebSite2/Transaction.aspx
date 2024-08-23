<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Transaction.aspx.cs" Inherits="Transaction" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            height: 22px;
        }
        .auto-style4 {
            height: 22px;
            width: 193px;
        }
        .auto-style5 {
            height: 22px;
            width: 193px;
            text-align: right;
            font-weight: bold;
            font-size: small;
        }
        .auto-style6 {
            height: 21px;
            width: 193px;
            text-align: right;
            font-weight: bold;
            font-size: small;
        }
        .auto-style7 {
            height: 21px;
        }
        .auto-style8 {
            width: 194px;
        }
        .auto-style9 {
            width: 194px;
            font-size: small;
            text-align: right;
        }
        .auto-style10 {
            font-size: small;
        }
        .auto-style11 {
            width: 194px;
            font-size: small;
            text-align: right;
            height: 22px;
        }
    </style>
</head>
<body style="background-color: beige; font-family: Verdana;">
    <form id="form1" runat="server">
        <div><strong>Transaction Page</strong></div>
        <div>
            <table class="auto-style1">
                <tr>
                    <td class="auto-style5">Member ID</td>
                    <td class="auto-style2">
                        <asp:Label ID="labelMemberID" runat="server" CssClass="auto-style10"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style5">Member Name</td>
                    <td class="auto-style2">
                        <asp:Label ID="labelMemberName" runat="server" CssClass="auto-style10"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style5">Select Product</td>
                    <td class="auto-style2">
                        <asp:DropDownList ID="dropdownSelectProduct" runat="server" AutoPostBack="True" OnSelectedIndexChanged="dropdownSelectProduct_SelectedIndexChanged" CssClass="auto-style10">
                            <asp:ListItem Text="Laptop" Value="0"/>
                            <asp:ListItem Text="Desktop" Value="1"/>
                            <asp:ListItem Text="Printer (dot matrix)" Value="2"/>
                            <asp:ListItem Text="Printer (ink jet)" Value="3"/>
                        </asp:DropDownList>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style6">Price</td>
                    <td class="auto-style7">
                        <asp:Label ID="labelPrice" runat="server" CssClass="auto-style10"></asp:Label>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style5">Quantity</td>
                    <td class="auto-style2">
                        <asp:TextBox ID="txtQuantity" runat="server" TextMode="Number" AutoPostBack="true" OnTextChanged="txtQuantity_TextChanged" CssClass="auto-style10">1</asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">&nbsp;</td>
                    <td class="auto-style2">
                        <asp:Button ID="btnAddToCart" runat="server" Text="Add to Cart" OnClick="btnAddToCart_Click" />
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">&nbsp;</td>
                    <td class="auto-style2">
                        <asp:Button ID="btnCheckOut" runat="server" Text="Check Out" />
                    </td>
                </tr>
            </table>
        </div>
        <table class="auto-style1">
            <tr>
                <td class="auto-style8"><strong>Transaction Summary</strong></td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td class="auto-style11">Total Amount Purchase</td>
                <td class="auto-style2">
                    <asp:Label ID="labelTotalAmountPurchase" runat="server" Text="₱0.00"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style9">Applied Discount</td>
                <td>
                    <asp:Label ID="labelAppliedDiscount" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style11">Sub Total</td>
                <td class="auto-style2">
                    <asp:Label ID="labelSubTotal" runat="server" Text="₱0.00"></asp:Label>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
