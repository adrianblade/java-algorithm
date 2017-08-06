package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private Vertex previousVertex;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}
	
	public void addEdge(Edge edge){
		this.adjacencies.add(edge);
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	@Override
	public String toString() {
		return ""+this.name;
	}
}
