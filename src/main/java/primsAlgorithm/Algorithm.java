package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

	private List<Vertex> unvisitedVertices;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	private double fullCost;

	public Algorithm(List<Vertex> unvisitedList) {
		System.out.println();
		this.spanningTree = new ArrayList<>();
		this.unvisitedVertices = unvisitedList;
		this.edgeHeap = new PriorityQueue<>();
	}

	public void primsAlgorithm(Vertex vertex) {

		unvisitedVertices.remove(vertex);

		while (!unvisitedVertices.isEmpty()) {

			for (Edge edge : vertex.getAdjacencies()) {
				if (this.unvisitedVertices.contains(edge.getTargetVertex())) {
					this.edgeHeap.add(edge);
				}
			}
			
			Edge e = this.edgeHeap.remove();
			
			this.spanningTree.add(e);
			this.fullCost += e.getWeight();

			vertex = e.getTargetVertex();
			this.unvisitedVertices.remove(vertex);

		}
		
		System.out.println(fullCost);
		
		for(Edge edge : this.spanningTree){
			System.out.println(edge.getStartVertex()+"-"+edge.getTargetVertex());
		}
	}

	public void setUnvisitedVertices(List<Vertex> unvisitedVertices) {
		this.unvisitedVertices = unvisitedVertices;
	}

	public List<Edge> getSpanningTree() {
		return this.spanningTree;
	}

	public void clearData() {
		this.spanningTree.clear();
		this.edgeHeap.clear();
	}
}
