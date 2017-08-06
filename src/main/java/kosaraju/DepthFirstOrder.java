package kosaraju;

import java.util.Stack;

public class DepthFirstOrder {

	private Stack<Vertex> stack;

	public DepthFirstOrder(Graph G) {
		
		stack = new Stack<>();
		
		for (Vertex vertex : G.getVertexList())
			if (!vertex.isVisited())
				dfs(vertex);
	}

	private void dfs(Vertex vertex) {
		
		vertex.setVisited(true);

		for (Vertex v : vertex.getAdjaenciesList()) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}

		stack.push(vertex);
	}

	public Stack<Vertex> getReversePost() {
	        return this.stack;
	 }
}
