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
<h3>All Teachers</h3>

<jsp:include page="/TeacherController" flush="true">
<jsp:param name="listOperation" value="View Teacher" />
</jsp:include>
 
<% if(request.getAttribute("allTeachers") != null){ %>  	
<table>
  <tr>
    <th>Teacher ID</th>
    <th>Teacher's name</th>
  </tr>
  <c:forEach items="${allTeachers}" var="teacher">
  	<tr>
    	<td>${teacher.id}</td>
    	<td>${teacher.name}</td>
    </tr>
  </c:forEach>
  </table><br/>
<% }
else{ %>
<h4>No Teachers added</h4>
<%} %>

<br/>
<a href="home.jsp">Go to home</a>
</body>
</html>