package topologicalOrdering;

import common.Vertex;

import java.util.Stack;

/**
 * Created by Adrian on 08/06/2017.
 */
public class TopologicalOrdering {
    
    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<Vertex>();
    }

    public void dfs(Vertex vertex) {
        vertex.setVisited(true);

        for (Vertex actual : vertex.getAdjacenciesList()) {
            if (!actual.isVisited()) {
                actual.setVisited(true);
                dfs(actual);
            }
        }

        stack.push(vertex);
    }
    
    public Stack<Vertex> getStack() {
        return stack;
    }
}
