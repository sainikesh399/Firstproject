<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
    <h3 class="text-center mt-3" style="color: burlywood; background-color: grey; padding: 20px;">
        List of students
    </h3>
    <div class="main">
  	<div class="sec1">
      <table id="cus">
  <tr class="row">
  	<th class="col-sm-2">Id</th>
  	<th class="col-sm-3">Name</th>
  	<th class="col-sm-3">Email</th>
  	<th class="col-sm-2">Age</th>
  <th class="col-sm-2">Gender</th>
  </tr>
  
  <c:forEach items="${studentmodel}" var="temp">
  <tr class="row">
  	<td class="col-sm-2">${temp.id}</td>
  	<td class="col-sm-3">${temp.name}</td>
  	<td class="col-sm-3">${temp.email}</td>
  	<td class="col-sm-2">${temp.age}</td>
  	<td class="col-sm-2">${temp.gender}</td>
  </tr>
   </c:forEach>
 </table>
 </div></div>
    <ul class="list-group-infos mt-3">
        <li class="list-group-item mt-3" >
            <a class="navbar-brand black" href="index">Go back</a>
        </li>
    </ul>
</div>
</body>
</html>