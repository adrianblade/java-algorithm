package bellmanFord;

import algorithmCommon.Edge;
import algorithmCommon.VertexAlgorithm;

import java.util.List;

/**
 * Created by Adrian on 11/06/2017.
 */
public class Algorithm {
    private List<VertexAlgorithm> vertexList;
    private List<Edge> edgeList;

    public Algorithm(List<VertexAlgorithm> vertexList, List<Edge> edgeList) {
        this.vertexList = vertexList;
        this.edgeList = edgeList;
    }

   public void shortestPath(VertexAlgorithm sourceVertex, VertexAlgorithm targetVertex ) {
        sourceVertex.setMinDistance(0);

        int length = this.vertexList.size();

        for ( int i = 0 ; i < length - 1; i++) {
            for(Edge edge : this.edgeList) {

                if (edge.getStartVertex().getMinDistance() == Double.MAX_VALUE) {
                    continue;
                }

                VertexAlgorithm v = edge.getStartVertex();
                VertexAlgorithm u = edge.getTargetVertex();

                double newDistance = v.getMinDistance() + edge.getWeight();

                if (newDistance < u.getMinDistance()) {
                    u.setMinDistance(newDistance);
                    u.setPreviousVertex(v);
                }
            }
        }
        for (Edge edge : this.edgeList) {
            if (edge.getStartVertex().getMinDistance() != Double.MAX_VALUE) {
                if (hasCycle(edge)) {
                    System.out.println("There is a negative cycle ...");
                }
            }
        }
        if (targetVertex.getMinDistance() == Double.MAX_VALUE) {
            System.out.println("There is no path at all to target from source ...");
        } else {
            System.out.println("Shorted path is :"+ targetVertex.getMinDistance());
        }
   }

    private boolean hasCycle(Edge edge) {
        return (edge.getStartVertex().getMinDistance() + edge.getWeight()) < edge.getTargetVertex().getMinDistance();
    }
}
