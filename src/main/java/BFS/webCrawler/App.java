package BFS.webCrawler;

/**
 * Created by Adrian on 04/06/2017.
 */
public class App {

    public static void main(String[] args) {

    String root = "http://www.google.com";
    BreadtFirstSearch bfs = new BreadtFirstSearch();
    bfs.discoverWeb(root);
    }
}
