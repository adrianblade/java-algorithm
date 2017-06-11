package dijskstra;

/**
 * Created by Adrian on 11/06/2017.
 */
public class App {
    public static void main (String[] args) {

        VertexDijkstra v1 = new VertexDijkstra("A");
        VertexDijkstra v2 = new VertexDijkstra("B");
        VertexDijkstra v3 = new VertexDijkstra("C");

        v1.addNeighbour(new Edge(1, v1, v2));
        v1.addNeighbour(new Edge(10, v1, v3));
        v2.addNeighbour(new Edge(1, v2, v3));

        Algorithm algorithm = new Algorithm();
        algorithm.computePaths(v1);

        System.out.println(algorithm.getShortestPathTo(v3));
    }
}
