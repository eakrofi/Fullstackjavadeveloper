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

<jsp:include page="/SubjectController" flush="true">
<jsp:param name="listOperation" value="View Teacher" />
</jsp:include>
 
<% if(request.getAttribute("allSubjects") != null){ %>  	
<table>
  <tr>
    <th>Subject ID</th>
    <th>Subject name</th>
    <th>Teacher id</th>
  </tr>
  <c:forEach items="${allSubjects}" var="subject">
  	<tr>
    	<td>${subject.id}</td>
    	<td>${subject.name}</td>
    	<td>${subject.teacherId}</td>
    </tr>
  </c:forEach>
  </table><br/>
<% }
else{ %>
<h4>No subjects added</h4>
<%} %>

<br/>
<a href="home.jsp">Go to home</a>
</body>
</html>