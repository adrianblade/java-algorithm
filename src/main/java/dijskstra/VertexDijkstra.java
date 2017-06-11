package dijskstra;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 11/06/2017.
 */
public class VertexDijkstra implements Comparable<VertexDijkstra>{
    private String name;
    private List<Edge> adjacenciesEdgeList;
    private boolean visited;
    private VertexDijkstra previousVertex;
    private double minDistance = Double.MAX_VALUE;

    public VertexDijkstra(String name) {
        this.name = name;
        this.adjacenciesEdgeList = new ArrayList<Edge>();
    }

    public void addNeighbour(Edge edge) {
        this.adjacenciesEdgeList.add(edge);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesEdgeList() {
        return adjacenciesEdgeList;
    }

    public void setAdjacenciesEdgeList(List<Edge> adjacenciesEdgeList) {
        this.adjacenciesEdgeList = adjacenciesEdgeList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public VertexDijkstra getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(VertexDijkstra previousVertex) {
        this.previousVertex = previousVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public int compareTo(VertexDijkstra otherVertex) {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }

    @Override
    public String toString() {
        return name;
    }
}
