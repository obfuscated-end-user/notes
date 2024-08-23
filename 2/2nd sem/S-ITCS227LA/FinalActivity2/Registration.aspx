<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Registration.aspx.cs" Inherits="Registration" %>

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
        <td><b>Student Number</b></td>
        <td>
            <asp:TextBox ID="studentRegNumTxtbox" runat="server" TextMode="Number"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="studentRegNumTxtbox" ErrorMessage="Please enter a valid number." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td class="auto-style4">Student Name</td>
        <td class="auto-style3">
            <asp:TextBox ID="studentRegNameTxtbox" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="studentRegNameTxtbox" ErrorMessage="Please enter a name." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><b>Password</b></td>
        <td>
            <asp:TextBox ID="studentRegPassTxtbox" runat="server" TextMode="Password"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ControlToValidate="studentRegPassTxtbox" ErrorMessage="Please enter a password." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><strong>Course/Year/Section</strong></td>
        <td>
            <asp:TextBox ID="studentRegCYS" runat="server"></asp:TextBox>
            <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ControlToValidate="studentRegCYS" ErrorMessage="Please enter a valid course/year/section format." ForeColor="Red"></asp:RequiredFieldValidator>
        </td>
    </tr>
    <tr>
        <td><strong>Gender</strong></td>
        <td>
            <asp:DropDownList ID="studentRegGender" runat="server">
                <asp:ListItem>MALE</asp:ListItem>
                <asp:ListItem>FEMALE</asp:ListItem>
            </asp:DropDownList>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td>
            <asp:Button ID="studentRegisterBtn" runat="server" Text="Register" OnClick="stdRegisterBtn_Click" />
            <asp:Label ID="studentRegLabel" runat="server"></asp:Label>
        </td>
    </tr>
</table>
</asp:Content>