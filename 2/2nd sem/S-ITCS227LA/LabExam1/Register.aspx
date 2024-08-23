<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Register.aspx.cs" Inherits="Register" %>
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
            font-size: large;
            }
        .auto-style3 {
            width: 86px;
            font-weight: bold;
        }
        .auto-style4 {
            width: 86px;
            font-weight: bold;
            height: 26px;
        }
        .auto-style5 {
            height: 26px;
        }
        .auto-style6 {
            font-size: x-large;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <table class="auto-style1">
            <tr>
                <td class="auto-style6" colspan="2"><strong>Registration Page</strong></td>
            </tr>
            <tr>
                <td class="auto-style3">Email:</td>
                <td>
                    <asp:TextBox ID="txtEmailRegister" runat="server" TextMode="Email"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="emailRegisterValidator" runat="server" ControlToValidate="txtEmailRegister" ErrorMessage="Please enter an email address." ForeColor="Red"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style4">Password:</td>
                <td class="auto-style5">
                    <asp:TextBox ID="txtPasswordRegister" runat="server" TextMode="Password"></asp:TextBox>
                    <asp:RequiredFieldValidator ID="passwordRegisterValidator" runat="server" ControlToValidate="txtPasswordRegister" ErrorMessage="Please enter a password." ForeColor="Red"></asp:RequiredFieldValidator>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">&nbsp;</td>
                <td>
                    <asp:Button ID="btnRegister" runat="server" Text="Register" OnClick="btnRegister_Click" />
                    <asp:Label ID="labelIndicatorRegister" runat="server" ForeColor="Red" Visible="False"></asp:Label>
                </td>
            </tr>
            </table>
    
    </div>
    </form>
</body>
</html>