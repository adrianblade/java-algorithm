package kruskal;

public class Node {

    private int height; // the approximate count of nodes below this node
	private int id; // a unique index for each node in the tree
	private Node parent;

	public Node(int rank, int id, Node parent) {
		this.height = rank;
		this.id = id;
		this.parent = parent;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
}
