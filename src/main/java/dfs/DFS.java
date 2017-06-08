package dfs;

import common.Vertex;

import java.util.Stack;

/**
 * Created by Adrian on 04/06/2017.
 */
public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<Vertex>();
    }

    public void dfs(Vertex root) {
        stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex + " ");
            for (Vertex vertex : actualVertex.getAdjacenciesList()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    vertex.setPrecedessor(actualVertex);
                    stack.add(vertex);
                }
            }
        }
    }

    public void recursiveDfs(Vertex vertex) {
        System.out.println(vertex + " ");

            for (Vertex v : vertex.getAdjacenciesList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    v.setPrecedessor(vertex);
                    recursiveDfs(v);
                }
            }
        }

}
