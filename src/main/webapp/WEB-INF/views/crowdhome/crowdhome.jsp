<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="gbk"%>
<%@ page import="com.springmvclearn.model.Project" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ÖÚ³ïÖ®¼Ò</title>
</head>

<body>
	<table>
 <tr>

<th>projectName</th>
<th>expectedAnnualRateOfReturn</th>
<th>holdingPeriod</th>
<th>purchaseAmount</th>
<th>CrowdingProgress</th>
<th>crowdStatus</th>
  </tr>
    	<%
    		//get the projects list
    		//		System.out.println("Now begin in crowdhome.jsp, check if the projects is in session. the projects in session is:" + session.getAttribute("Projects"));
    		List projects = (ArrayList<Project>) request.getAttribute("Projects");
    		Iterator p = projects.iterator();
    		while (p.hasNext()) {
    			Project project = (Project) p.next();
    	%>
  <tr>
    <td><%= project.getProjectName() %> </td>
    <td><%= project.getExpectedAnnualRateOfReturn() %></td>
    <td><%= project.getHoldingPeriod() %></td>
    <td><%= project.getPurchaseAmount() %></td>
    <td><%= project.getCrowdingProgress() %></td>
    <td><%= project.getCrowdStatus() %></td>
    <td><a href = "<%= request.getContextPath() %>/projectdetail.do?id=<%=project.getId() %>" >Buy</a></td>
  </tr>
  	<% } %>
	</table>
<%= request.getRequestURL() %><br>
<%= request.getRequestURI() %><br>
<%= request.getContextPath() %><br>
<%= request.getServletPath() %><br>
</body>
</html>