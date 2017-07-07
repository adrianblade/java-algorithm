package kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

	 public void spanningTree(List<Vertex> vertexList,List<Edge> edgeList){
		
		 DisjointSet disjointSet = new DisjointSet(vertexList);

		    /* Create a list of edges */
		    List<Edge> tree = new ArrayList<Edge>();

		    /* Java's modified version of mergesort guarantees nlog(n) time here */
		    Collections.sort(edgeList);

		    /* Kruskal's algorithm */
		    for (Edge e : edgeList) {
		      Vertex u = e.getStartVertex();
		      Vertex v = e.getTargetVertex();
		      if (disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) {
		        /* Vertices v and u are not in the same component */
		        tree.add(e);

		        /* Union them in the tree */
		        disjointSet.union(u.getNode(), v.getNode());
		      }
		    }

		    for(Edge edge : tree){
		    	System.out.print(""+edge.getStartVertex()+""+edge.getTargetVertex()+"-");
		    }
	 }
}
