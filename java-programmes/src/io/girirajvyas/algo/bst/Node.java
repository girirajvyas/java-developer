package io.girirajvyas.algo.bst;

public class Node {
	private Node left, right;
	private String data;

	public Node(String data) {
		this.data = data;
	}

	public void insert(Node n) {

	}

	public static void main(String[] args) {
		Node node = new Node("5");
		// node.setLeft(new Node("3"));
		// node.setRight(new Node("4"));
		node.insert(new Node("7"));
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
