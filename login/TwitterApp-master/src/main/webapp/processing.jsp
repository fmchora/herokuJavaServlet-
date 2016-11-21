<%-- 
    Document   : processing
    Created on : Nov 9, 2016, 6:50:29 PM
    Author     : Chris
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Page</title>
    </head>
    <body>
        <% String userName = request.getParameter("userName");
           String password = request.getParameter("password");
            if(userName == "Lyon"){
                request.getSession().setAttribute("username", "Lyon"); %>
        <c:redirect url="welcomePage.jsp"/>
        <% }else{ %>
        <c:redirect url="incorrect.jsp"/>
        <% } %>
}
    </body>
</html>