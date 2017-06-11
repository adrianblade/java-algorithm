package algorithmCommon;

/**
 * Created by Adrian on 11/06/2017.
 */
public class Edge {
    private double weight;
    private VertexAlgorithm startVertex;
    private VertexAlgorithm targetVertex;

    public Edge(double weight, VertexAlgorithm startVertex, VertexAlgorithm targetVertex) {
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

    public VertexAlgorithm getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(VertexAlgorithm startVertex) {
        this.startVertex = startVertex;
    }

    public VertexAlgorithm getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(VertexAlgorithm targetVertex) {
        this.targetVertex = targetVertex;
    }
}
