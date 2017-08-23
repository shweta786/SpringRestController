<%-- 
    Document   : index
    Created on : Aug 18, 2017, 5:00:45 PM
    Author     : SHWETA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    <body>
    <center>
        <form action="employee/add" method="GET">
        <button type="submit" id="create" name="crate">
            
                Create New
           
        </button>
        </form>
        <br>
        <form action="employee/list" method="GET">
        <button type="submit" id="display" name="display">
            
                Display Info
            
        </button>
        </form>
    </center>
    </body>
</html>
