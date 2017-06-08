package BFS.webCrawler;

import BFS.Vertex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Adrian on 04/06/2017.
 */
public class BreadtFirstSearch {

    private Queue<String> queue;
    private List<String> discoverWebSiteList;

    public BreadtFirstSearch() {
        this.queue = new LinkedList<String>();
        this.discoverWebSiteList = new ArrayList<String>();
    }

    public void discoverWeb(String root) {
        this.queue.add(root);
        this.discoverWebSiteList.add(root);

        while(!queue.isEmpty()) {
            String v = this.queue.remove();
            String rawHtml = readURL(v);
            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern .matcher(rawHtml);

            while (matcher.find()) {
                String w = matcher.group();
                if (!discoverWebSiteList.contains(w)) {
                    discoverWebSiteList.add(w);
                    System.out.println("Website found with URL: " + w);
                    queue.add(w);

                }
            }
        }
    }

    private String readURL(String v) {
        String rawHtml = "";
        try {
            URL url = new URL(v);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((url.openStream())));
                    String inputLine= "";
            while ((inputLine = bufferedReader.readLine()) != null) {
                rawHtml += inputLine;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rawHtml;
    }
}
