<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="images/favicon.png">
        <link rel="stylesheet" href="stylesheets/main.css">
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
       <br>
        <c:forEach var="status" items="${tweets}">
            <div class="twitter" style="margin: 0 auto; border-radius: 10px; background: #00ACEE; padding: 1px; width: 700px">
                <h4>${status.getUser().getScreenName()}:</h4>
                <h3>${status.getText()}</h3>
            </div>
            <br>
        </c:forEach>
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