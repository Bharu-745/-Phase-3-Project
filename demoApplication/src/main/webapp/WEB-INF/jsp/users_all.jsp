<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div >
  <c:forEach items="${users}" var="user">
    <div >
      <div >
      <div > User ID: ${user.id} </div>
      <br>
        <div> User Name: ${user.name} </div>
     <div> LastLoginDate: ${user.lastlogindate} </div>
        
      
        <div > <button type="button" 
           onClick="location.href='/admin/${user.id} ' ">Browse</button></div>
      </div>
    </div>
    </c:forEach>
  </div>
<br>


</body>
</html>