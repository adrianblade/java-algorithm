package topologicalOrdering;

import common.Vertex;

/**
 * Created by Adrian on 08/06/2017.
 */
public class App {
    public static void main(String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        vertexA.addNeighbour(vertexC);
        vertexA.addNeighbour(vertexD);

        vertexB.addNeighbour(vertexD);

        vertexC.addNeighbour(vertexB);
        vertexC.addNeighbour(vertexE);

        vertexE.addNeighbour(vertexD);
        vertexE.addNeighbour(vertexB);

        TopologicalOrdering to = new TopologicalOrdering();

        to.dfs(vertexA);
        System.out.println("Reverse: " );
        for (Vertex vertex : to.getStack()) {
            System.out.println(vertex);
        }

    }
}
