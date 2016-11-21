<%-- 
    Document   : viewPost
    Created on : Nov 12, 2016, 12:18:38 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="general.css" rel="stylesheet"/>
        <link href="table.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Post</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String subject = request.getParameter("subject");
            String comment = request.getParameter("comment");
            //Post post1 = (Post)request.getAttribute("post");
        %>
        <h1>View some posts!</h1>
        <table  align="center"
                border="1"
                cellspacing="1"
                cellpadding="1"
                class="responstable">
            <thead>
                <tr>
                    <th>User: </th>
                    <th>Subject: </th>
                    <th>Comment: </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= name%></td>
                    <td><%= subject%></td>
                    <td><%= comment%></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
