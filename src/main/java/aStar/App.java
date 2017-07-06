package aStar;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // Create nodes
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");

        //Add neighbours to nodes
        node1.addNeighbour(new Edge(10, node2));
        //node1.addNeighbour(new Edge(node4, 10)); // This gives path [A,D] as the route is very cheap.
        node1.addNeighbour(new Edge(100, node4 )); // Whereas this gives [A,B,C,D] due to the added cost.
        node2.addNeighbour(new Edge(10, node3));
        node3.addNeighbour(new Edge(10, node4));

        Algorithm as = new Algorithm();
        as.aStarSearchAlgo(node1, node4);

        // Print out the path
        List<Node> path = as.printPath(node4);
        System.out.println(path);

    }
}
