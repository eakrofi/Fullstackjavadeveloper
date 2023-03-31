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
<h3>All Subjects</h3>

<jsp:include page="/ClassController" flush="true">
<jsp:param name="listOperation" value="View Teacher" />
</jsp:include>
 
<% if(request.getAttribute("allClasses") != null){ %>  	
<table>
  <tr>
    <th>Class ID</th>
    <th>Class name</th>
    <th>Subject id</th>
  </tr>
  <c:forEach items="${allClasses}" var="class">
  	<tr>
    	<td>${class.id}</td>
    	<td>${class.name}</td>
    	<td>${class.teacher_id}</td>
    </tr>
  </c:forEach>
  </table><br/>
<% }
else{ %>
<h4>No class added</h4>
<%} %>

<br/>
<a href="home.jsp">Go to home</a>
</body>
</html>