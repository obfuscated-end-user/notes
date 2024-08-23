<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPageUser.master" AutoEventWireup="true" CodeFile="BuyAddToCart.aspx.cs" Inherits="BuyAddToCart" %>

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
            width: 399px;
            font-weight: bold;
            text-align: right;
        }
        .auto-style4 {
            height: 23px;
            width: 362px;
            text-align: left;
        }
        .auto-style6 {
            width: 399px;
            text-align: center;
        }
        .auto-style7 {
            font-weight: bold;
            width: 399px;
            text-align: right;
        }
        .auto-style8 {
            text-align: left;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <div>
             <asp:GridView ID="GridView1" runat="server" AutoGenerateColumns="False" CellPadding="4" ForeColor="#333333" GridLines="None" Width="1144px"   OnSelectedIndexChanged="GridView1_SelectedIndexChanged" AutoGenerateSelectButton="True">
                 <AlternatingRowStyle BackColor="White" />
            <Columns>
                <asp:BoundField DataField="ProductID" HeaderText="ProductID" >
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="ProductName" HeaderText="ProductName" >
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="Price" HeaderText="Price" >
                <ItemStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="Stocks" HeaderText="Stocks" >
                <HeaderStyle HorizontalAlign="Center" />
                </asp:BoundField>
                <asp:BoundField DataField="SRP" HeaderText="SRP" >
                <HeaderStyle HorizontalAlign="Center" />
                </asp:BoundField>
            </Columns>
            <FooterStyle BackColor="#990000" ForeColor="White" Font-Bold="True" />
            <HeaderStyle BackColor="#990000" Font-Bold="True" ForeColor="White" />
            <PagerStyle BackColor="#FFCC66" ForeColor="#333333" HorizontalAlign="Center" />
            <RowStyle BackColor="#FFFBD6" ForeColor="#333333" />
            <SelectedRowStyle BackColor="#FFCC66" Font-Bold="True" ForeColor="Navy" />
            <SortedAscendingCellStyle BackColor="#FDF5AC" />
            <SortedAscendingHeaderStyle BackColor="#4D0000" />
            <SortedDescendingCellStyle BackColor="#FCF6C0" />
            <SortedDescendingHeaderStyle BackColor="#820000" />
        </asp:GridView>
    </div>
    <div>

        <table class="auto-style2">
            <tr>
                <td class="auto-style3">Selected Product:</td>
                <td class="auto-style4">
                    <asp:Label ID="selectedProductLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style7">Price:</td>
                <td class="auto-style8">
                    <asp:Label ID="productPriceLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style7">Quantity:</td>
                <td class="auto-style8">
                    <asp:TextBox ID="quantityTxtbox" runat="server" TextMode="Number">0</asp:TextBox>
                    <asp:Label ID="addToCartQuantityLabel" runat="server" ForeColor="Red" Text="Please enter a valid amount." Visible="False"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style3">SRP:</td>
                <td class="auto-style4">
                    <asp:Label ID="productSrpLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style7">Membership Type:</td>
                <td class="auto-style8">
                    <asp:DropDownList ID="membershipTypeDropdown" runat="server">
                        <asp:ListItem>SILVER</asp:ListItem>
                        <asp:ListItem>GOLD</asp:ListItem>
                        <asp:ListItem>PLATINUM</asp:ListItem>
                    </asp:DropDownList>
                </td>
            </tr>
            <tr>
                <td class="auto-style7">Total Amount Purchase:</td>
                <td class="auto-style8">
                    <asp:Label ID="productTapLabel" runat="server"></asp:Label>
                </td>
            </tr>
            <tr>
                <td class="auto-style6">
                    <asp:Label ID="incrementLabel" runat="server" Text="1" Visible="False"></asp:Label>
                </td>
                <td class="auto-style8">
                    <asp:Button ID="addToCartBtn" runat="server" Text="Add to Cart" OnClick="addToCartBtn_Click" Height="35px" style="font-weight: 700" Width="112px" />
                    <asp:Label ID="addToCartLabel" runat="server" ForeColor="Red" Visible="False"></asp:Label>
                </td>
            </tr>
        </table>

    </div>
</asp:Content>