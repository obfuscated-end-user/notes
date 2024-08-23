<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeFile="Home.aspx.cs" Inherits="Home" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        * {
            font-family: Tahoma, sans-serif;
        }
        body {
            background-color: lightskyblue;
        }
        .auto-style1 {
        text-align: center;
    }
        </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <p class="auto-style1">
    <asp:HyperLink ID="HyperLink4" runat="server" NavigateUrl="~/Login.aspx" style="font-size: medium; font-weight: 700">Login to an existing account</asp:HyperLink>
</p>
<p class="auto-style1">
    <asp:HyperLink ID="HyperLink5" runat="server" NavigateUrl="~/Registration.aspx" style="font-weight: 700">Don&#39;t have an account? Register now!</asp:HyperLink>
</p>
</asp:Content>