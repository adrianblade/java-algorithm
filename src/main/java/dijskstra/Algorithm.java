package dijskstra;

import algorithmCommon.Edge;
import algorithmCommon.VertexAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Adrian on 11/06/2017.
 */
public class Algorithm {

    public void computePaths(VertexAlgorithm sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<VertexAlgorithm> priorityQueue = new PriorityQueue<VertexAlgorithm>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            VertexAlgorithm actualVertex = priorityQueue.poll();
            for (Edge edge : actualVertex.getAdjacenciesEdgeList()) {

                VertexAlgorithm v = edge.getTargetVertex();
                double weight = edge.getWeight();
                double minDistanceViaV = actualVertex.getMinDistance() + weight;

                if (minDistanceViaV < v.getMinDistance()) {
                    priorityQueue.remove(v);
                    v.setPreviousVertex(actualVertex);
                    v.setMinDistance(minDistanceViaV);
                    priorityQueue.add(v);
                }
            }
        }

    }

    public List<VertexAlgorithm> getShortestPathTo(VertexAlgorithm targetVertex) {
        List<VertexAlgorithm> path = new ArrayList<VertexAlgorithm>();
        for (VertexAlgorithm vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}
