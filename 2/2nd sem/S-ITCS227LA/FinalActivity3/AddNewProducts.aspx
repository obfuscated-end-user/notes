<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPageAdmin.master" AutoEventWireup="true" CodeFile="AddNewProducts.aspx.cs" Inherits="AddNewProdcuts" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        * {
            font-family: Tahoma, sans-serif;
        }
        body {
            background-color: lightskyblue;
        }
        .auto-style2 {
            width: 751px;
            text-align: center;
        }
        .auto-style3 {
            width: 751px;
            font-weight: bold;
            text-align: center;
        }
        .auto-style4 {
            font-size: x-large;
        }
        .auto-style5 {
            text-align: center;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <div align ="center" style =" margin:0 auto;">
        <h2 style =" text-decoration: underline overline blink; color: #5f9853">You Have the Following Product In Your Cart</h2>
        <br /><br />
                <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" CellPadding="4" ForeColor="#333333" GridLines="None" BorderStyle="None" BorderWidth="5px" Width="1152px" >
            <AlternatingRowStyle BackColor="White" />
            <Columns>
                <asp:BoundField DataField="ProductID" HeaderText="ProductID">
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="ProductName" HeaderText="ProductName">
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="Price" HeaderText="Price">
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="Stocks" HeaderText="Stocks">
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="SRP" HeaderText="SRP">
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
            </Columns>
            <FooterStyle BackColor="#990000" Font-Bold="True" ForeColor="White" />
            <HeaderStyle BackColor="#990000" Font-Bold="True" ForeColor="White" />
            <PagerStyle BackColor="#FFCC66" ForeColor="#333333" HorizontalAlign="Center" />
            <RowStyle BackColor="#FFFBD6" ForeColor="#333333" />
            <SelectedRowStyle BackColor="#FFCC66" Font-Bold="True" ForeColor="Navy" />
            <SortedAscendingCellStyle BackColor="#FDF5AC" />
            <SortedAscendingHeaderStyle BackColor="#4D0000" />
            <SortedDescendingCellStyle BackColor="#FCF6C0" />
            <SortedDescendingHeaderStyle BackColor="#820000" />
        </asp:GridView>
        <br />
        <span class="auto-style4"><strong>Add New Product:<br />
        </strong></span></div>
    <div>
        <table class="auto-style1">
            <tr>
                <td class="auto-style3">Product ID</td>
                <td class="auto-style5">
                    <asp:TextBox ID="addNewProductIDTxtBox" runat="server"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style3">Product Name</td>
                <td class="auto-style5">
                    <asp:TextBox ID="addNewProductNameTxtBox" runat="server"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style3">Price</td>
                <td class="auto-style5">
                    <asp:TextBox ID="addNewPriceTxtBox" runat="server" TextMode="Number"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style3">Stocks</td>
                <td class="auto-style5">
                    <asp:TextBox ID="addNewStocksTxtBox" runat="server" TextMode="Number"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td class="auto-style2">
                    <asp:Label ID="incrementLabel" runat="server" Text="6" Visible="False"></asp:Label>
                </td>
                <td class="auto-style5">
                    <asp:Button ID="addNewProductsBtn" runat="server" Text="Add Product" OnClick="addNewProductsBtn_Click" />
                </td>
            </tr>
        </table>
    </div>
</asp:Content>

