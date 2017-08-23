<%-- 
    Document   : employee_form
    Created on : Aug 21, 2017, 3:25:10 PM
    Author     : SHWETA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Form</title>
    </head>
    <body>
       
    <form method="POST" action="save">
        <table width="100%">
            <tr>
                <td>Name: <input name="name" /></td>
            </tr>
            <tr>
                <td>Email: <input  name="email" /></td>
            </tr>
            <tr>
                <td>Gender: <input  name="gender" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form>
    </body>
</html>
