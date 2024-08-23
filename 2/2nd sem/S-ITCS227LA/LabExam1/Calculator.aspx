<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Calculator.aspx.cs" Inherits="Calculator" %>
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
        .auto-style3 {
            width: 209px;
            font-weight: bold;
        }
        .auto-style4 {
            width: 209px;
            font-weight: bold;
            height: 23px;
        }
        .auto-style5 {
            height: 23px;
        }
        .auto-style6 {
            width: 209px;
            font-weight: bold;
            height: 26px;
        }
        .auto-style7 {
            height: 26px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <table class="auto-style1">
            <tr>
                <td class="auto-style2" style="font-size: x-large;" colspan="2"><strong>Loan Calculator</strong></td>
            </tr>
            <tr>
                <td class="auto-style6">First name</td>
                <td class="auto-style7">
                    <asp:TextBox ID="txtFirstName" runat="server"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtFirstName" ErrorMessage="Please enter your first name." ForeColor="Red"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style6">Last name</td>
                <td class="auto-style7">
                    <asp:TextBox ID="txtLastName" runat="server"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtLastName" ErrorMessage="Please enter your last name." ForeColor="Red"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style6">Customer type</td>
                <td class="auto-style7">
                    <asp:DropDownList ID="dropdownCustomerType" runat="server">
                        <asp:ListItem>Platinum</asp:ListItem>
                        <asp:ListItem>Gold</asp:ListItem>
                        <asp:ListItem>Silver</asp:ListItem>
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td class="auto-style6">Type of car to loan</td>
                <td class="auto-style7">
                    <asp:DropDownList ID="dropdownCarType" runat="server">
                        <asp:ListItem>SUV</asp:ListItem>
                        <asp:ListItem>Van</asp:ListItem>
                        <asp:ListItem>Sedan</asp:ListItem>
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td class="auto-style4">Down payment</td>
                <td class="auto-style5">
                    <asp:RadioButton ID="radioBtn20" runat="server" GroupName="downPaymentOptions" Text="20%" Checked="True" />
                    <br />
                    <asp:RadioButton ID="radioBtn25" runat="server" GroupName="downPaymentOptions" Text="25%" />
                    <br />
                    <asp:RadioButton ID="radioBtn30" runat="server" GroupName="downPaymentOptions" Text="30%" />
                    <br />
                    <asp:RadioButton ID="radioBtn35" runat="server" GroupName="downPaymentOptions" Text="35%" />
                    <br />
                    <asp:RadioButton ID="radioBtn40" runat="server" GroupName="downPaymentOptions" Text="40%" />
                    <br />
                    <asp:RadioButton ID="radioBtn45" runat="server" GroupName="downPaymentOptions" Text="45%" />
                    <br />
                    <asp:RadioButton ID="radioBtn50" runat="server" GroupName="downPaymentOptions" Text="50%" />
                </td>
            </tr>
            <tr>
                <td class="auto-style3">Number of years to pay</td>
                <td>
                    <asp:DropDownList ID="dropdownYearsToPay" runat="server">
                        <asp:ListItem>1</asp:ListItem>
                        <asp:ListItem>2</asp:ListItem>
                        <asp:ListItem>3</asp:ListItem>
                        <asp:ListItem>4</asp:ListItem>
                        <asp:ListItem>5</asp:ListItem>
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td class="auto-style3">&nbsp;</td>
                <td>
                    <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />
                </td>
            </tr>
        </table>
    
        </div>
    </form>
</body>
</html>