package dagShortestPath;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

	private Stack<Vertex> stack; //Using stack as a Data structure
	
	public TopologicalSort(){
		this.stack = new Stack<>();
	}
	
	public void makeTopologicalOrder(List<Vertex> vertexList){
		
		//Perform DFS recursively on all vertices
		for(Vertex vertex : vertexList){
			if( !vertex.isVisited() ){
				dfs(vertex);
			}
		}
	}

	private void dfs(Vertex vertex) {
		
		for(Edge edge : vertex.getAdjacenciesList()){
			if( !edge.getTargetVertex().isVisited() ){
				edge.getTargetVertex().setVisited(true);
				dfs(edge.getTargetVertex());
			}
		}
		
		this.stack.push(vertex);
	}
	
	//Return the topological order
	public Stack<Vertex> getTopologicalOrder(){
		Collections.reverse(stack);
		return this.stack;		
	}
}
