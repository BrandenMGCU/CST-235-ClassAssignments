<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Form</title>
</head>
<body>
<form action="TestForm.jsp" method="post">
  <label for="firstname">First Name:</label>
  <input type="text" id="Firstname" name="firstname"><br><br>
  <label for="lastname">Last Name:</label>
  <input type="text" id="Lastname" name="lastname"><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>

<html>
<head>
	<title> Post Method AFTER FORM</title>
</head>
<body>
<h1><p>The Name You Entered Was: </p></h1>
<b>First Name: </b>
<%= request.getParameter("firstname")%>
</br>
<b>Last Name:</b>
<%= request.getParameter("lastname")%>
</body>
</html>