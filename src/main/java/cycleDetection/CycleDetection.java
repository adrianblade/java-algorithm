package cycleDetection;

import common.Vertex;

import java.util.List;

/**
 * Created by Adrian on 10/06/2017.
 */

public class CycleDetection {

    /**
     * Cycles detector
     * @param vertexList
     */
    public void detectCycles(List<Vertex> vertexList) {
        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                dfs(vertex);
            }
        }
    }


    /**
     * DFS cycle detector
     * @param vertex
     */
    private void dfs(Vertex vertex) {
        vertex.setVisited(false);
        vertex.setBeingVisited(true);

        for (Vertex v : vertex.getAdjacenciesList()) {


            if (v.isBeingVisited()) {
                System.out.println("Cycle is detected ...");
                return;
            }
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }
    }
}
