<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="View.aspx.cs" Inherits="View" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .auto-style2 {
            font-size: x-large;
        }
</style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <span class="auto-style2">View Grades</span><asp:RadioButtonList ID="RadioBtnListFilterTable" AutoPostBack="true" runat="server" OnSelectedIndexChanged="RadioBtnListFilterTable_SelectedIndexChanged">
        <asp:ListItem Selected="True">All</asp:ListItem>
        <asp:ListItem>Passed</asp:ListItem>
        <asp:ListItem>Failed</asp:ListItem>
    </asp:RadioButtonList>
<asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" DataKeyNames="StudentID" BackColor="White" BorderColor="#999999" BorderStyle="None" BorderWidth="1px" CellPadding="3" GridLines="Vertical">
    <AlternatingRowStyle BackColor="#DCDCDC" />
    <Columns>
        <asp:BoundField DataField="StudentID" HeaderText="StudentID" ReadOnly="True" SortExpression="StudentID" />
        <asp:BoundField DataField="StudentName" HeaderText="StudentName" SortExpression="StudentName" />
        <asp:BoundField DataField="CourseYrSection" HeaderText="CourseYrSection" SortExpression="CourseYrSection" />
        <asp:BoundField DataField="Gender" HeaderText="Gender" SortExpression="Gender" />
        <asp:BoundField DataField="PrelimGrade" HeaderText="PrelimGrade" SortExpression="PrelimGrade" />
        <asp:BoundField DataField="MidtermGrade" HeaderText="MidtermGrade" SortExpression="MidtermGrade" />
        <asp:BoundField DataField="FinalGrade" HeaderText="FinalGrade" SortExpression="FinalGrade" />
        <asp:BoundField DataField="AverageGrade" HeaderText="AverageGrade" SortExpression="AverageGrade" />
        <asp:BoundField DataField="Remark" HeaderText="Remark" SortExpression="Remark" />
    </Columns>
    <FooterStyle BackColor="#CCCCCC" ForeColor="Black" />
    <HeaderStyle BackColor="#000084" Font-Bold="True" ForeColor="White" />
    <PagerStyle BackColor="#999999" ForeColor="Black" HorizontalAlign="Center" />
    <RowStyle BackColor="#EEEEEE" ForeColor="Black" />
    <SelectedRowStyle BackColor="#008A8C" Font-Bold="True" ForeColor="White" />
    <SortedAscendingCellStyle BackColor="#F1F1F1" />
    <SortedAscendingHeaderStyle BackColor="#0000A9" />
    <SortedDescendingCellStyle BackColor="#CAC9C9" />
    <SortedDescendingHeaderStyle BackColor="#000065" />
</asp:GridView>
</asp:Content>