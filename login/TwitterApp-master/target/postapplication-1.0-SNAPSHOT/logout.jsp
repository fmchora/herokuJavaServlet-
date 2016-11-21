<%-- 
    Document   : logout
    Created on : Nov 9, 2016, 7:51:01 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            request.getSession().removeAttribute("username");
            request.getSession().invalidate(); %>
        <c:redirect url="login.jsp"/>
        
        <h1>You are logged out.</h1>
    </body>
</html>
