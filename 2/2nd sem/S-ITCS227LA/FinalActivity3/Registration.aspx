<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Registration.aspx.cs" Inherits="Registration" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        * {
            font-family: Tahoma, sans-serif;
        }
        body {
            background-color: lightskyblue;
        }
        .auto-style2 {
            width: 100%;
        }
        .auto-style3 {
            font-size: xx-large;
            text-align: center;
        }
        .auto-style4 {
            width: 252px;
            text-align: left;
        }
        .auto-style7 {
            width: 224px;
        }
        .auto-style8 {
            text-align: left;
        }
        .auto-style9 {
            width: 224px;
            text-align: right;
            font-size: x-large;
        }
        .auto-style10 {
            font-size: x-large;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style3">
        <strong>Account Registration</strong></p>
    <table class="auto-style2">
        <tr>
            <td class="auto-style9"><strong>Username:</strong></td>
            <td class="auto-style8">
                <asp:TextBox ID="registerUsernameTxtbox" runat="server" CssClass="auto-style10"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="registerUsernameTxtbox" ErrorMessage="Enter a valid username." ForeColor="Red" CssClass="auto-style10"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style9"><strong>Password:</strong></td>
            <td class="auto-style8">
                <asp:TextBox ID="registerPasswordTxtbox" runat="server" TextMode="Password" CssClass="auto-style10"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="registerPasswordTxtbox" ErrorMessage="Enter a valid password." ForeColor="Red" CssClass="auto-style10"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style7">&nbsp;</td>
            <td class="auto-style4">
                <asp:Button ID="registerBtn" runat="server" Text="Register" OnClick="registerBtn_Click" Height="39px" style="font-weight: 700" Width="94px" />
                <asp:Label ID="registerAccLabel" runat="server" ForeColor="Red" Visible="False"></asp:Label>
            </td>
        </tr>
    </table>
</asp:Content>