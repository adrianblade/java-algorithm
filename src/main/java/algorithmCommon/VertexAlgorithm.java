package algorithmCommon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 11/06/2017.
 */
public class VertexAlgorithm implements Comparable<VertexAlgorithm>{
    private String name;
    private List<Edge> adjacenciesEdgeList;
    private boolean visited;
    private VertexAlgorithm previousVertex;
    private double minDistance = Double.MAX_VALUE;

    public VertexAlgorithm(String name) {
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

    public VertexAlgorithm getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(VertexAlgorithm previousVertex) {
        this.previousVertex = previousVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public int compareTo(VertexAlgorithm otherVertex) {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }

    @Override
    public String toString() {
        return name;
    }
}
