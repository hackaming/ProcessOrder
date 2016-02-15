<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="gbk"%>
<%@ page import="com.springmvclearn.model.Project"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Project project = (Project) request.getAttribute("Project");
		System.out
				.println("Now get the project object from request in projectdetail.jsp, the object is:" + project);
		System.out.println(project.getCrowdingProgress());
		System.out.println(project.getProjectName());
	%>
	<form action="buy.do" method="post">
		<table>
			<th>Project Name</th>
			<th>Purchase Amount</th>
			<th>Holding Period</th>
			<th>Expected Annual Rate of Return</th>
			<th>Crowd Status</th>
			<th>Crowding Progress</th>
			<tr>
				<td><%=project.getProjectName()%></td>
				<td><%=project.getPurchaseAmount()%></td>
				<td><%=project.getHoldingPeriod()%></td>
				<td><%=project.getExpectedAnnualRateOfReturn()%></td>
				<td><%=project.getCrowdStatus()%></td>
				<td><%=project.getCrowdingProgress()%></td>
			</tr>
		</table>
		¹ºÂòÊýÁ¿<input type="text" name="amount" /><br> 
		<input type="hidden" name="projectid" value="<%=project.getId()%>"> <input
			type="submit" value="ÏÂµ¥" />
	</form>
</body>
</html>