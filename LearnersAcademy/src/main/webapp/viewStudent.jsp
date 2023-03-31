<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All Students</h3>

<jsp:include page="/StudentController" flush="true">
<jsp:param name="listOperation" value="View Teacher" />
</jsp:include>
 
<% if(request.getAttribute("allStudents") != null){ %>  	
<table>
  <tr>
    <th>Student ID</th>
    <th>Student name</th>
    <th>Class id</th>
  </tr>
  <c:forEach items="${allStudents}" var="student">
  	<tr>
    	<td>${student.id}</td>
    	<td>${student.name}</td>
    	<td>${student.teacher_id}</td>
    </tr>
  </c:forEach>
  </table><br/>
<% }
else{ %>
<h4>No student added</h4>
<%} %>

<br/>
<a href="home.jsp">Go to home</a>
</body>
</html>