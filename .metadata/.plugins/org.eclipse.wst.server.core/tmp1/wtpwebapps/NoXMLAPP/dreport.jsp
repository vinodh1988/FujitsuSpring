<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/style.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>People Details</h1>
   <table>
         <thead>
               <th>Sno</th>
               <th>Name</th>
               <th>City</th>
         </thead>
         <tbody>
              <c:forEach items="${people}" var="x">
                <tr>
                     <td>${x.sno}</td>
                     <td>${x.name}</td>
                     <td>${x.city}</td>
                </tr>
              </c:forEach>
         </tbody>
   </table>
</body>
</html>