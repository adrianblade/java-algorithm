package bellmanFord;

import algorithmCommon.Edge;
import algorithmCommon.VertexAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 11/06/2017.
 */
public class App {
    public static void main (String[] args) {

        List<VertexAlgorithm> vertexAlgorithmList = new ArrayList<VertexAlgorithm>();

        vertexAlgorithmList.add(new VertexAlgorithm("A"));
        vertexAlgorithmList.add(new VertexAlgorithm("B"));
        vertexAlgorithmList.add(new VertexAlgorithm("C"));
        vertexAlgorithmList.add(new VertexAlgorithm("D"));

        List<Edge> edgeList = new ArrayList<Edge>();

        edgeList.add(new Edge(1, vertexAlgorithmList.get(0), vertexAlgorithmList.get(1)));
        edgeList.add(new Edge(1, vertexAlgorithmList.get(1), vertexAlgorithmList.get(2)));
        edgeList.add(new Edge(1, vertexAlgorithmList.get(2), vertexAlgorithmList.get(3)));
        edgeList.add(new Edge(1, vertexAlgorithmList.get(0), vertexAlgorithmList.get(3)));


        Algorithm algorithm = new Algorithm(vertexAlgorithmList,edgeList);
        algorithm.shortestPath(vertexAlgorithmList.get(0) , vertexAlgorithmList.get(3));

    }
}
