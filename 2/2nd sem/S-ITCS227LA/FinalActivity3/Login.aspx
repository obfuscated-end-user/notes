<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Login.aspx.cs" Inherits="Login" %>

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
            height: 23px;
            text-align: left;
        }
        .auto-style4 {
            font-size: xx-large;
            text-align: center;
        }
        .auto-style6 {
            text-align: right;
            width: 507px;
            font-weight: bold;
            font-size: x-large;
        }
        .auto-style7 {
            height: 23px;
            text-align: right;
            width: 507px;
            font-weight: bold;
            font-size: x-large;
        }
        .auto-style8 {
            text-align: left;
        }
        .auto-style9 {
            text-align: right;
            width: 507px;
        }
        .auto-style10 {
            font-size: x-large;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style4">
        <strong>Account Login</strong></p>
    <table class="auto-style2">
        <tr>
            <td class="auto-style6">Username:</td>
            <td class="auto-style8">
                <asp:TextBox ID="loginUsernameTxtbox" runat="server" CssClass="auto-style10"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="loginUsernameTxtbox" ErrorMessage="Enter a valid username." ForeColor="Red" CssClass="auto-style10"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style7">Password:</td>
            <td class="auto-style3">
                <asp:TextBox ID="loginPasswordTxtbox" runat="server" TextMode="Password" CssClass="auto-style10"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="loginPasswordTxtbox" ErrorMessage="Enter a valid password." ForeColor="Red" CssClass="auto-style10"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style9">
                <asp:HyperLink ID="RegisterHere" runat="server" ForeColor="Blue" NavigateUrl="~/Registration.aspx" style="font-size: x-large">[RegisterHere]</asp:HyperLink>
            </td>
            <td class="auto-style8">
                <asp:Button ID="loginBtn" runat="server" Text="Login" style="text-align: center; margin-left: 0px; font-weight: 700;" OnClick="loginBtn_Click" Height="41px" Width="98px" />
            </td>
        </tr>
    </table>
</asp:Content>