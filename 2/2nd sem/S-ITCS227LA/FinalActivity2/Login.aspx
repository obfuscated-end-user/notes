<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .auto-style2 {
            width: 100%;
        }
        .auto-style3 {
            height: 22px;
        }
        .auto-style4 {
            height: 22px;
            font-weight: bold;
        }
        .auto-style5 {
            font-size: x-large;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style5">
        Login Page</p>
<table class="auto-style2">
    <tr>
        <td class="auto-style4">Username</td>
        <td class="auto-style3">
            <asp:TextBox ID="loginUsernameTxtbox" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="loginUsernameTxtbox" ErrorMessage="Please enter your username." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><b>Password</b></td>
        <td>
            <asp:TextBox ID="loginPasswordTxtbox" runat="server" TextMode="Password"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ErrorMessage="Please enter your password." ForeColor="Red" ControlToValidate="loginPasswordTxtbox"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <asp:Button ID="loginBtn" runat="server" Text="Login" OnClick="loginBtn_Click" />
            <asp:Label ID="loginLabel" runat="server"></asp:Label>
        </td>
    </tr>
</table>
</asp:Content>