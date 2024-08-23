<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Registration.aspx.cs" Inherits="Registration" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
            height: 26px;
            text-align: right;
            width: 169px;
            font-size: small;
        }
        .auto-style3 {
            text-align: right;
            width: 169px;
            font-size: small;
        }
        .auto-style4 {
            width: 169px;
        }
    </style>
</head>
<body style="background-color: beige; font-family: Verdana;">
    <form id="form1" runat="server">
        <div style="font-weight: 700">Registration Page</div>
        <div>
            <table class="auto-style1">
                <tr>
                    <td class="auto-style3">First Name</td>
                    <td>
                        <asp:TextBox ID="txtFirstName" runat="server"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">Last Name</td>
                    <td>
                        <asp:TextBox ID="txtLastName" runat="server"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style2">Birthday</td>
                    <td>
                        <asp:TextBox ID="txtBDay" runat="server" TextMode="Date"></asp:TextBox>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style3">Membership Type</td>
                    <td>
                        <asp:DropDownList ID="dropdownMembership" runat="server" AutoPostBack="True">
                            <asp:ListItem Text="SILVER" Value="0"/>
                            <asp:ListItem Text="GOLD" Value="1"/>
                            <asp:ListItem Text="PLATINUM" Value="2"/>
                        </asp:DropDownList>
                    </td>
                </tr>
                <tr>
                    <td class="auto-style4">&nbsp;</td>
                    <td>
                        <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />
                    </td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
