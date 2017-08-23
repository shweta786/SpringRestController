<%-- 
    Document   : employee_page
    Created on : Aug 21, 2017, 3:26:07 PM
    Author     : SHWETA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
    </head>
    <body>
        <h1>Employee Information</h1>
        <table width="100%" border="1">
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
            </tr>
            <c:forEach items="${empList}" var="employee">
            <tr>
                <td>${employee.name}</td>
                <td>${employee.email}</td>
                <td>${employee.gender}</td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
