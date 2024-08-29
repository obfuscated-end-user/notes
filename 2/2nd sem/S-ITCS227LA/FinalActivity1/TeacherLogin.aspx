<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="TeacherLogin.aspx.cs" Inherits="TeacherLogin" %>

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
    Teacher Login Page</p>
<table class="auto-style2">
    <tr>
        <td class="auto-style4">Username</td>
        <td class="auto-style3">
            <asp:TextBox ID="tchLogUsername" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="tchLogUsername" ErrorMessage="Please enter your username." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><b>Password</b></td>
        <td>
            <asp:TextBox ID="tchLogPassword" runat="server" TextMode="Password"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ErrorMessage="Please enter your password." ForeColor="Red" ControlToValidate="tchLogPassword"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <asp:Button ID="tchLoginBtn" runat="server" Text="Login" OnClick="techLoginBtn_Click" />
            <asp:Label ID="tchLogLabel" runat="server"></asp:Label>
        </td>
    </tr>
</table>
</asp:Content>