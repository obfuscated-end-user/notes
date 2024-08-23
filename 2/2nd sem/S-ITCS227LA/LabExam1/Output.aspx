<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Output.aspx.cs" Inherits="Output" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        body {
            font-family: Tahoma, Arial, sans-serif;
            background-color: lightblue;
        }
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            font-size: x-large;
            height: 33px;
        }
        .auto-style4 {
            font-size: x-large;
        }
        .auto-style5 {
            width: 243px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <table class="auto-style1">
            <tr>
                <td class="auto-style2" colspan="2"><strong>Client Details</strong></td>
            </tr>
            <tr>
                <td class="auto-style5"><strong>First name:</strong></td>
                <td>
                    <asp:Label ID="labelFirstName" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><strong>Last name:</strong></td>
                <td>
                    <asp:Label ID="labelLastName" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><strong>Email:</strong></td>
                <td>
                    <asp:Label ID="labelEmail" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style4" colspan="2"><strong>Loan Details</strong></td>
            </tr>
            <tr>
                <td class="auto-style5"><strong>Customer Type:</strong></td>
                <td>
                    <asp:Label ID="labelCustomerType" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><b>Down Payment:</b></td>
                <td>
                    <asp:Label ID="labelDownPayment" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><b>Total Cash Out:</b></td>
                <td>
                    <asp:Label ID="labelTotalCashOut" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><b>Monthly Amortization:</b></td>
                <td>
                    <asp:Label ID="labelMonthlyAmortization" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><b>Miscellaneous:</b></td>
                <td>
                    <asp:Label ID="labelMiscellaneous" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5"><b>Total Price:</b></td>
                <td>
                    <asp:Label ID="labelTotalPrice" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style5">
                    <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="~/Calculator.aspx">Back to calculator</asp:HyperLink>
                </td>
                <td>
                    <asp:HyperLink ID="HyperLink2" runat="server" NavigateUrl="~/Login.aspx">Use a different account</asp:HyperLink>
                </td>
            </tr>
        </table>
    
    </div>
    </form>
</body>
</html>