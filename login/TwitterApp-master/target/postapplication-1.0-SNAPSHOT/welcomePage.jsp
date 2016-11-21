<%-- 
    Document   : welcomePage
    Created on : Nov 7, 2016, 9:31:34 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="general.css" rel="stylesheet"/>
        <link href="table.css" rel="stylesheet"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <%
            String username = request.getParameter("userName");
            String password = request.getParameter("password");
        %>
        <h1>Welcome <%= username %></h1>
        <br/><br/>
        <form method="POST" action="createPost">
        <table border="2"
               align="center"
               cellspacing="1"
               cellpadding="1"
               class="responstable">
            <tbody>
                <tr>
                    <td>Name : </td>
                    <td><input type="text"
                               name="name"
                               value=""
                               /></td>
                </tr>
                <tr>
                    <td>Subject : </td>
                    <td><input type="text" name="subject" value="" size="20" />
                    </td>
                </tr>
                <tr>
                    <td>Comments : </td>
                    <td><textarea name="comment" rows="4" cols="20">
                        </textarea></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Post" name="sendPost" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>

        
        <form name="logout" action="logout.jsp" method="POST">
            <input type="submit" value="Logout" name="logout" />
        </form>
        
    </body>
</html>
