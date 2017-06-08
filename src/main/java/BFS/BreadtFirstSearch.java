package BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Adrian on 04/06/2017.
 */
public class BreadtFirstSearch {

    public void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<Vertex>();

        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex + "-");

            for (Vertex vertex : actualVertex.getNeighbourList()) {
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    queue.add(vertex);
                }
            }
        }
    }
}
