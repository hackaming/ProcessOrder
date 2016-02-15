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
<%
ArrayList<Orders> o = (ArrayList<Orders>) request.getSession().getAttribute("Orders");
%>

<body>
Now begin to pay, need to call the 3rd interfaces!

The order id is:<%= o.get(0).getId() %>>
</body>
</html>

