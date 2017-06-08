package dfs;

import common.Vertex;

/**
 * Created by Adrian on 04/06/2017.
 */
public class App {
    public static void main (String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        vertexA.addNeighbour(vertexB);
        vertexA.addNeighbour(vertexC);
        vertexB.addNeighbour(vertexD);
        vertexB.addNeighbour(vertexE);

        DFS dfs = new DFS();
        dfs.dfs(vertexA);
        dfs.recursiveDfs(vertexA);
    }
}
