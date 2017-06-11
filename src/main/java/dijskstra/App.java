package dijskstra;

import algorithmCommon.Edge;
import algorithmCommon.VertexAlgorithm;

/**
 * Created by Adrian on 11/06/2017.
 */
public class App {
    public static void main (String[] args) {

        VertexAlgorithm v1 = new VertexAlgorithm("A");
        VertexAlgorithm v2 = new VertexAlgorithm("B");
        VertexAlgorithm v3 = new VertexAlgorithm("C");

        v1.addNeighbour(new Edge(1, v1, v2));
        v1.addNeighbour(new Edge(10, v1, v3));
        v2.addNeighbour(new Edge(1, v2, v3));

        Algorithm algorithm = new Algorithm();
        algorithm.computePaths(v1);

        System.out.println(algorithm.getShortestPathTo(v3));
    }
}
