<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Teacher</h2>

<form action="TeacherController" method="post">
<label>Name</label>
<input type="text" name="name" required><br/>

<input type="submit" value="Add Teacher">
<input type="reset">
</form>
<br>
<a href="viewTeacher.jsp">View Teachers</a>
<br>

<h2>Add Subject</h2>

<form action="SubjectController" method="post">
<label>Name</label>
<input type="text" name="name"><br/>
<label>Teacher id</label>
<input type="text" name="teacher_id"><br/>
<input type="submit" value="Add Subject">
<input type="reset">
</form>

<br>
<a href="SubjectController">View Subjects</a>
<br>

<h2>Add Class</h2>

<form action="ClassController" method="post">
<label>Name</label>
<input type="text" name="name"><br/>
<label>Subject ID</label>
<input type="text" name="subject_id"><br/>
<input type="submit" value="Add Class">
<input type="reset">
</form>

<br>
<a href="ClassController">View Classes</a>
<br>

<h2>Add Student</h2>

<form action="StudentController" method="post">
<label>Name</label>
<input type="text" name="name"><br/>
<label>Class ID</label>
<input type="text" name="class_id"><br/>
<input type="submit" value="Add Student">
<input type="reset">
</form>

<br>
<a href="StudentController">View Students</a>
<br>

</body>
</html>