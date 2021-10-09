<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div >

  <c:forEach items="${purchases}" var="pR">
<form>
<div>Date: ${pR.date}</div>
<div>Category: ${pR.category}</div>

    
    <div > <button type="button" 
           onClick="location.href='/purchaseReports/${pR.id} ' ">Browse</button></div>
    </form>
  </c:forEach>  
  </div>
<br>


</body>
</html>
