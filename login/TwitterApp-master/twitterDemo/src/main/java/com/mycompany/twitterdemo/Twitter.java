package com.mycompany.twitterdemo;

//import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
//import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.ws.rs.core.UriBuilder;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

@WebServlet(name = "Twitter", urlPatterns = {"/Twitter"})
public class Twitter extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, TwitterException {

        // The factory instance is re-useable and thread safe.
//        twitter4j.Twitter twitter = TwitterFactory.getSingleton();
//        List<Status> statuses = twitter.getHomeTimeline();
//        request.setAttribute("statuses", statuses);
//        request.getRequestDispatcher("twitter.jsp").forward(request, response);
        //out.println("Showing home timeline.");
        //for (Status status : statuses) {
        //    out.println(status.getUser().getName() + ":"
        //            + status.getText());
        //}
// The factory instance is re-useable and thread safe.
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("kKbL0isqIO3jXtIhtcK2P8rik")
                .setOAuthConsumerSecret("RXfkXIWrSwcEaPWeOi21lCEMgnQQKrzrpdJbLeYpVSE5KG6ymV")
                .setOAuthAccessToken("436115774-vHKtwVfyw4OyPL0w9SLPMRh7i8N6EWNlqSfpthsL")
                .setOAuthAccessTokenSecret("t0khsq5GxRul9k6BPo20RLYmaVf6XzwD0GqdBq7IqYuJE");
        Configuration configuration = cb.build();
        TwitterFactory tf = new TwitterFactory(configuration);
        twitter4j.Twitter twitter = tf.getInstance();
        Query query = new Query(request.getParameter("searchParam"));
        QueryResult result = twitter.search(query);
        List<Status> tweets = result.getTweets();
        System.out.println("Tweet:" + tweets.get(0).getText());
        System.out.println("key:" + twitter.getConfiguration().getOAuthConsumerKey());
        System.out.println("secret: " + twitter.getConfiguration().getOAuthConsumerSecret());
        request.setAttribute("tweets", tweets);
        request.getRequestDispatcher("twitter.jsp").forward(request, response);
//for (Status status : result.getTweets()) {
        //    System.out.println("@" + tweets.getFromUser() + ":" + status.getText());
        //}
//        UriBuilder uriBuilder = UriBuilder.fromPath("http://www.omdbapi.com").queryParam("s", request.getParameter("searchParam"));
//
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> map = mapper.readValue(uriBuilder.build().toURL(), Map.class);
//
//        List list = (List) map.get("Search");
        //request.setAttribute("movies", status);
        //request.getRequestDispatcher("twitter.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (TwitterException ex) {
            Logger.getLogger(Twitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (TwitterException ex) {
            Logger.getLogger(Twitter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
