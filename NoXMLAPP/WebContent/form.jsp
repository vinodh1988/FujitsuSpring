<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <s:form action="process.asp" method="post" modelAttribute="person">
         <table>
             <tr>
                  <td>Sno</td>
                  <td><s:input path="sno"/></td>
             </tr>
              <tr>
                  <td>Name</td>
                  <td><s:input path="name"/></td>
             </tr>
              <tr>
                  <td>City</td>
                  <td><s:input path="city"/></td>
             </tr>
              <tr>
                  <td colspan=2 align="center"><button type="submit">Store</button></td>
                  
             </tr>
         </table>
      </s:form>
</body>
</html>