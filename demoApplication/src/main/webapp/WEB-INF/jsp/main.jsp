<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

      table,
      th,
      td{
      
        padding: 10px;
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>

</head>
<body>

<%
String O = request.getParameter("Operation");
if(request.getParameter("Operation").equals ("Add")){
out.print(O);

	%>
	<form action="/admin/details" method="get">
	Product Id: <input type = "text" name = "productId" />
	Product Category: <input type = "text" name = "productCat" />
	Product Name: <input type = "text" name = "productName" />
	Product Description: <input type = "text" name = "productDesc" />
	Product Price: <input type = "text" name = "productPrice" />
	Product Seller: <input type = "text" name = "productSeller" />
	<input type = "submit" value = "Submit" />
	</form>
	<%
	}
else{
%>
<div>
<c:forEach items="${products}" var="product">
<div>

<form action='/admin/update'>
<table>
<tr>
<td><input type="radio" name="productId" value= "${product.id}"	 ></td>
<td><input type="text" name= "productCat" value= "${product.category}" > </td>
<td><input type="text" name="productName" value= "${product.name}"> </td>
<td><input type="text" name="productDesc" value= "${product.description}"> </td>
<td><input type="text" name= "productPrice" value="${product.price}">  </td>
<td><input type="text" name= "productSeller" value="${product.seller}"></td>
<td><button type="button" onClick="location.href='/admin/delete/${product.id} ' ">Delete</button></td>
<td><input type="submit" value="Update"></td>   
</tr>
</table>
 </form>



</div>
</c:forEach>
</div>
	<%
	}
%>
	
</body>
</html>