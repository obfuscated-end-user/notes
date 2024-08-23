<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Teacher.aspx.cs" Inherits="Teacher" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .auto-style2 {
            width: 100%;
        }
        .auto-style3 {
            font-size: x-large;
            width: 359px;
        }
        .auto-style4 {
            width: 359px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table class="auto-style2">
        <tr>
            <td class="auto-style3">Admin Page</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td class="auto-style4"><strong>Reset all student passwords to:</strong></td>
            <td>
                <asp:TextBox ID="adminPasswordTextbox" runat="server">Abc123456</asp:TextBox>
                <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ErrorMessage="Enter a valid password." ForeColor="Red" ControlToValidate="adminPasswordTextbox"></asp:RequiredFieldValidator>
            </td>
        </tr>
        <tr>
            <td class="auto-style4">&nbsp;</td>
            <td>
                <asp:Button ID="resetBtn" runat="server" Text="Reset" OnClick="resetBtn_Click" />
                <asp:Label ID="passwordIndicatorLabel" runat="server"></asp:Label>
            </td>
        </tr>
    </table>
</asp:Content>

