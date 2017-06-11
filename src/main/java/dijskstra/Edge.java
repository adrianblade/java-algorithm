package dijskstra;

import common.Vertex;

/**
 * Created by Adrian on 11/06/2017.
 */
public class Edge {
    private double weight;
    private VertexDijkstra startVertex;
    private VertexDijkstra targetVertex;

    public Edge(double weight, VertexDijkstra startVertex, VertexDijkstra targetVertex) {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public VertexDijkstra getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(VertexDijkstra startVertex) {
        this.startVertex = startVertex;
    }

    public VertexDijkstra getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(VertexDijkstra targetVertex) {
        this.targetVertex = targetVertex;
    }
}
