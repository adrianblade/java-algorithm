package kosaraju;

public class Edge {

	private double weight;
	private Vertex startVertex;
	private Vertex targetVertex;
	
	public Edge(double weight, Vertex stratVertex, Vertex targetVertex) {
		this.weight = weight;
		this.startVertex = stratVertex;
		this.targetVertex = targetVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setStartVertex(Vertex stratVertex) {
		this.startVertex = stratVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

}
