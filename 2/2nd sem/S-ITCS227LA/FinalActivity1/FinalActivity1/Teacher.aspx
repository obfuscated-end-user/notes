<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Teacher.aspx.cs" Inherits="Teacher" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .auto-style2 {
            width: 100%;
        }
        .auto-style3 {
            width: 176px;
            font-weight: bold;
        }
        .auto-style4 {
            font-size: x-large;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style4">
        Teacher Page</p>
    <table class="auto-style2">
        <tr>
            <td class="auto-style3">Student ID</td>
            <td>
                <asp:TextBox ID="tchPageStdID" runat="server"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">Name</td>
            <td>
                <asp:Label ID="tchPageNameLabel" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">Prelim Grade</td>
            <td>
                <asp:Label ID="tchPagePrelimLabel" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">Midterm Grade</td>
            <td>
                <asp:Label ID="tchPageMidtermLabel" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">Final Grade</td>
            <td>
                <asp:Label ID="tchPageFinalLabel" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td class="auto-style3">&nbsp;</td>
            <td>
                <asp:Button ID="tchPageSearchAndComputeBtn" runat="server" Text="Search and Compute grades" Width="184px" OnClick="tchPageSearchAndComputeBtn_Click" />
            </td>
        </tr>
        <tr>
            <td class="auto-style3">Average</td>
            <td>
                <asp:Label ID="tchPageAverageLabel" runat="server"></asp:Label>
            </td>
        </tr>
    </table>
</asp:Content>