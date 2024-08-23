<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="StudentRegistration.aspx.cs" Inherits="StudentRegistration" %>

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
    Student Registration Page</p>
<table class="auto-style2">
    <tr>
        <td><b>Student ID</b></td>
        <td>
            <asp:TextBox ID="stdRegStdID" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="stdRegStdID" ErrorMessage="Please enter a valid ID." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td class="auto-style4">Name</td>
        <td class="auto-style3">
            <asp:TextBox ID="stdRegName" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="stdRegName" ErrorMessage="Please enter a name." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><b>Password</b></td>
        <td>
            <asp:TextBox ID="stdRegPassword" runat="server" TextMode="Password"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="stdRegPassword" ErrorMessage="Please enter a password." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <asp:Button ID="stdRegisterBtn" runat="server" Text="Register" OnClick="stdRegisterBtn_Click" />
            <asp:Label ID="stdRegLabel" runat="server"></asp:Label>
        </td>
    </tr>
</table>
</asp:Content>