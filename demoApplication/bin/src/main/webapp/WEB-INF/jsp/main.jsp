<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

      table,
      th,
      td {
       
        padding: 10px;
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>
</head>
<body>
<%
String d = request.getParameter("date");
String s = request.getParameter("source");
String de = request.getParameter("destination");
String n = request.getParameter("persons");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root","Root@123");
PreparedStatement st = con.prepareStatement("select * from mydb.airlines where source= ? and destination =?");
//String sql = ("select distinct Airways from mydb.airlines where Source="+s;
//st.setString(1,d );
st.setString(1,s);
st.setString(2,de);
//st.setString(1,p);
ResultSet rs = st.executeQuery();
%>
<form action="details.jsp" method="get">
<table>
<thead style='font-weight:bold'>
<tr>
<td>Select</td>
<td>Source</td>
<td>Destination</td>
<td>Airways</td>
<td>Price Per Person</td>
<td>Total Price</td>
</tr>
</thead>

<tbody>

<%
while (rs.next()){
	int p =Integer.parseInt(n) * Integer.parseInt(rs.getString("Price"));
	%>
<tr>
<td><input type="radio" name="Book" value="<%=rs.getString("Id")+"N"+n	 %>"></td>
<td><%=rs.getString("Source") %></td>
<td><%=rs.getString("Destination") %></td>
<td><%=rs.getString("Airways") %></td>
<td><%=rs.getString("Price") %></td>
<td><%=p %></td>
</tr> 
	 
<%} %>

</tbody>
</table>
 <input type = "submit" value = "Submit" />
      </form>
</body>
</html>