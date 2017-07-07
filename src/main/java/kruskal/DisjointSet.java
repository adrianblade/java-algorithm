package kruskal;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

	private int nodeCount = 0;
	private int setCount = 0;
	private List<Node> rootNodes;

	public DisjointSet(List<Vertex> vertices) {
		this.rootNodes = new ArrayList<Node>(vertices.size());
		makeSets(vertices);
	}

	/*
	 * Returns the index of the set that n is currently in. The index of the
	 * root node of each set uniquely identifies the set. This is used to
	 * determine whether two elements are in the same set.
	 */
	public int find(Node n) {
		
		Node current = n;

		/* Ride the pointer up to the root node */
		while (current.getParent() != null)
			current = current.getParent();

		Node root = current;

		/*
		 * Ride the pointer up to the root node again, but make each node below
		 * a direct child of the root. This alters the tree such that future
		 * calls will reach the root more quickly. "path comression"
		 */
		current = n;
		while (current != root) {
			Node temp = current.getParent();
			current.setParent( root );
			current = temp;
		}

		return root.getId();
	}

	/*
	 * Combines the sets containing nodes i and j.
	 */
	public void union(Node node1, Node node2) {
		int index1 = find(node1);
		int index2 = find(node2);

		/* Are these nodes already part of the same set? */
		if (index1 == index2)
			return;

		/* Get the root nodes of each set (this will run in constant time) */
		Node root1 = this.rootNodes.get(index1);
		Node root2 = this.rootNodes.get(index2);

		/* Attach the smaller tree to the root of the larger tree ez a "union by height" */
		if (root1.getHeight() < root2.getHeight()) {
			root1.setParent(root2);
		} else if (root1.getHeight() > root2.getHeight()) {
			root2.setParent(root1);
		} else {
			root2.setParent(root1);
			root1.setHeight(root1.getHeight()+1);
		}

		this.setCount--;
	}

	/*
	 * Takes a list of n vertices and creates n disjoint singleton sets.
	 */
	public void makeSets(List<Vertex> vertices) {
		for (Vertex v : vertices)
			makeSet(v);
	}

	/*
	 * Creates a singleton set containing one vertex.
	 */
	public void makeSet(Vertex vertex) {
		Node n = new Node(0, rootNodes.size(), null);
		vertex.setNode(n);
		this.rootNodes.add(n);
		this.setCount++;
		this.nodeCount++;
	}
}
