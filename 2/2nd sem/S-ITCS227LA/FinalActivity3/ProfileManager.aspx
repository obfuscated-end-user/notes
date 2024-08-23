<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPageUser.master" AutoEventWireup="true" CodeFile="ProfileManager.aspx.cs" Inherits="ProfileManager" %>

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
        font-size: x-large;
    }
        .auto-style4 {
            text-align: center;
        }
        .auto-style5 {
            font-size: x-large;
            text-align: center;
        }
        .auto-style6 {
            text-align: left;
            height: 29px;
        }
        .auto-style7 {
            height: 29px;
            width: 576px;
            text-align: right;
        }
        .auto-style8 {
            text-align: left;
            width: 576px;
        }
        .auto-style9 {
            text-align: left;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style5">
        <strong>Profile Manager</strong></p>
    <p class="auto-style4">
        <strong><span class="auto-style3">Welcome,
        </span>
        <asp:Label ID="loggedInUserLabel" runat="server" CssClass="auto-style3"></asp:Label>
        </strong>
    </p>
    <table class="auto-style2">
        <tr>
            <td class="auto-style7"><strong>Change password:</strong></td>
            <td class="auto-style6">
                <asp:TextBox ID="profMgrPasswordTxtbox" runat="server" TextMode="Password"></asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ErrorMessage="Enter a valid password." ForeColor="Red" ControlToValidate="profMgrPasswordTxtbox"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style8">&nbsp;</td>
            <td class="auto-style9">
                <asp:Button ID="Button1" runat="server" Text="Change Password" OnClick="Button1_Click" style="font-weight: 700" />
                <asp:Label ID="profMgrPasswordVerifyLabel" runat="server" ForeColor="Red" Visible="False"></asp:Label>
            </td>
        </tr>
    </table>
</asp:Content>