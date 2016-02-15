<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.springmvclearn.model.Orders" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<Orders> o = (ArrayList<Orders>) request.getAttribute("Orders");
%>
Your order has been dealt with, please pay in time.
<table>
<th>Order ID</th>
<th>User ID</th>
<th>Project ID</th>
<th>Purchase Amount</th>
<tr>
<td><%= o.get(0).getId() %></td>
<td><%= o.get(0).getUserid() %></td>
<td><%= o.get(0).getProjectid() %>  </td>
<td><%= o.get(0).getPurchaseamount() %></td>
</tr>
</table>
<a href="<%= request.getRequestURI() %>/pay.do">Please pay your order.</a>
</body>
</html>