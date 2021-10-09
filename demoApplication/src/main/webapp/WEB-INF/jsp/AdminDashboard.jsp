<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "/admin/main" method = "GET">
        
         
         <select name = "Operation">
         <option>Add</option>
         <option>Update</option>
         <option>Delete</option>
         </select>
          <input type = "submit" value = "Submit" />
         </form>
<br />
<br />
<div > <button type="button" 
           onClick="location.href='/admin/users_all ' ">Users</button></div>
      </div>
   <div > <button type="button" 
           onClick="location.href='/purchaseReports/all ' ">PurchaseReports</button></div>
      </div>
<div > <button type="button" 
           onClick="location.href='/admin/change ' ">ChangePassword</button></div>
      </div>
<form action="HomePage.jsp" method="get">
<input type="submit" name="home" value="Home">
</form>
</body>
</html>