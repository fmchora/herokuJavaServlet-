<%-- 
    Document   : login
    Created on : Nov 7, 2016, 8:50:47 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="general.css" rel="stylesheet"/>
        <link href="table.css" rel="stylesheet"/>
    </head>
    <body>
        <h1>Log In Page</h1>
        
        <form name="loginForm" action="loginPage" method="POST">
            <table align="center" class="responstable">
                <tbody>
                    <tr>
                        <td>Username : </td>
                        <td><input type="text" name="userName" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td>Password : </td>
                        <td><input type="password" name="password" value="" size="20" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Login" name="login" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
