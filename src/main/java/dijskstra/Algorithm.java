package dijskstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Adrian on 11/06/2017.
 */
public class Algorithm {

    public void computePaths(VertexDijkstra sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<VertexDijkstra> priorityQueue = new PriorityQueue<VertexDijkstra>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            VertexDijkstra actualVertex = priorityQueue.poll();
            for (Edge edge : actualVertex.getAdjacenciesEdgeList()) {

                VertexDijkstra v = edge.getTargetVertex();
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

    public List<VertexDijkstra> getShortestPathTo(VertexDijkstra targetVertex) {
        List<VertexDijkstra> path = new ArrayList<VertexDijkstra>();
        for (VertexDijkstra vertex = targetVertex; vertex != null; vertex = vertex.getPreviousVertex()) {
            path.add(vertex);
        }
        Collections.reverse(path);
        return path;
    }
}
