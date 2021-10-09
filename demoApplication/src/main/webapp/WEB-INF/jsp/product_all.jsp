<%@ include file="header.jsp" %>

 
  <div >
  <c:forEach items="${products}" var="product">
    <div >
      <div >
      <div > Product Category: ${product.category} </div>
      <br>
        <div> Product Name: ${product.name} </div>
        
        <div >
        <p>Price : ${product.price}  </p>
		<p>Seller :  ${product.seller} </p>  
        </div>
        <div > <button type="button" 
           onClick="location.href='/products/${product.id} ' ">Browse</button></div>
      </div>
    </div>
    </c:forEach>
  </div>
<br>

</body>
</html>
