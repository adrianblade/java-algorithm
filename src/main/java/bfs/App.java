package bfs;

import common.Vertex;

/**
 * Created by Adrian on 04/06/2017.
 */
public class App {
    /**
     * BFS Main
     * @param args
     */
    public static void main (String[] args) {
        BreadtFirstSearch breadtFirstSearch = new BreadtFirstSearch();

        Vertex vertex1 = new Vertex("A");
        Vertex vertex2 = new Vertex("B");
        Vertex vertex3 = new Vertex("C");
        Vertex vertex4 = new Vertex("D");
        Vertex vertex5 = new Vertex("E");

        vertex1.addNeighbour(vertex2);
        vertex1.addNeighbour(vertex4);
        vertex4.addNeighbour(vertex5);
        vertex2.addNeighbour(vertex3);

        breadtFirstSearch.bfs(vertex1);
    }
}
