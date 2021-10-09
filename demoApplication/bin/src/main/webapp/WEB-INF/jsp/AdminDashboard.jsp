<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "main.jsp" method = "GET">
        
         
         <select name = "Operation">
         <option>Add</option>
         <option>Update</option>
         <option>Delete</option>
         </select>
          <input type = "submit" value = "Submit" />
         </form>
<br />
<br />
         
<form action ="ChangePassword.jsp" method="get">
<input type="submit" name="Change Password" value="Change Password">
</form>
<form action="HomePage.jsp" method="get">
<input type="submit" name="home" value="Home">
</form>
</body>
</html>