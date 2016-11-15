<%-- 
    Document   : createPost
    Created on : Nov 12, 2016, 9:20:13 PM
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Post</title>
    </head>
    <body>
        <h1>Create Post</h1>
        
        <form action="loadPosts" method="POST">
             Post:<br>
             <input type="text" name="post" >
             <br><br>
             <input type="submit" value="Submit">
         </form>
        
    </body>
</html>
