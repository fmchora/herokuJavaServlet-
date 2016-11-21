<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="images/favicon.png">
        <link rel="stylesheet" href="stylesheets/style.css">
        <title>Twitter</title>
    </head>
    <body>
        <img src="images/fadeup.png" alt="fadeup" height="50" width="100%"/>
        <img src="images/twitter.png" alt="logo" height="15%" width="15%"/>
        <div>
            Enter the hashtag you would like to search
            <br><br>
            <form name="movieForm" action="Twitter" method="POST">
                #
                <input type="text" id="searchParam" name="searchParam"/>
                <br>
                <input type="submit" value="Search"/>
                <br><br>
            </form>
            Hashtag
        </div>
        <h2>
            <c:forEach var="status" items="${tweets}" >
                <p>Here is a status</p>
                <p>${status.getText()}</p>
            </c:forEach>
        </h2>
        <div>
            <img src="images/line.png" alt="line" width="50%">
            <a href="index.html">Web Applications</a>
            <br><br><br>
        </div>
        <div class="footer">
            <img src="images/fadedown.png" alt="fadedown" height="50" width="100%"/>
        </div>
    </body>
</html>