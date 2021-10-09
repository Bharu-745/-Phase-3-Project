<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("productId");
String Cat = request.getParameter("productCat");
String Name = request.getParameter("productName");
String Desc = request.getParameter("productDesc");
String Price = request.getParameter("productPrice");
String Seller = request.getParameter("productSeller");
%>
Confirm?

<button type=button onClick="location.href='/admin/update/<%= id %>/<%=Cat%>/<%=Name%>/<%=Desc%>/<%=Price%>/<%=Seller%>' "> Submit</button>

<div > Category: ${product.category} </div>
<div > Name: ${product.name} </div>
<p>Description : ${product.description}  </p>
<p>Price : ${product.price}  </p>
		<p>Seller :  ${product.seller} </p> 

</body>
</html>