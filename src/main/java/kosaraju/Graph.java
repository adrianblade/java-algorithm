package kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	
	public Graph(){
		
	}
	
	public Graph(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}
	
	public Graph getTransposeGraph(){
		
		Graph transposeGraph = new Graph();
	
		List<Vertex> transposeVertexList = new ArrayList<>();
		
		for(Vertex vertex : this.vertexList){
			transposeVertexList.add(vertex);
		}
		
		for(Edge edge : this.edgeList){
			transposeVertexList.get(transposeVertexList.indexOf(edge.getTargetVertex())).addNeighbour(edge.getStartVertex());
		}
		
		transposeGraph.setVertexList(transposeVertexList);
		
		return transposeGraph;
	}
	
	public Graph getNormalGraph(){
		return null;
	}
}
