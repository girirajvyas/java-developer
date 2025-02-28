package io.girirajvyas.questions;

import java.util.ArrayList;
import java.util.List;

import io.girirajvyas.questions.pojo.TreeNode;

public class BinaryTreeQuestion {

	public static void main(String[] args) {
		// Variable to store the same child nodes
		List<TreeNode> sameChildNodes = new ArrayList<>();
		// Data setup
		TreeNode testNode = getBinaryTreeWithSameChildNode();
		//TreeNode testNode = getBinaryTreeWithUniqueChildNode();
		
		findSubnodesWithSameChild(sameChildNodes, testNode);
	}

	private static TreeNode getBinaryTreeWithUniqueChildNode() {
		// Base Node
		TreeNode node = new TreeNode(1);
		node.setLeft(new TreeNode(2));
		node.setRight(new TreeNode(3));

		// Left1 Node
		node.getLeft().setLeft(new TreeNode(4));
		node.getLeft().setRight(new TreeNode(5));

		// Right1 Node
		node.getRight().setLeft(new TreeNode(6));
		node.getRight().setRight(new TreeNode(7));
		
		return node;
	}

	private static TreeNode getBinaryTreeWithSameChildNode() {
		// Base Node
		TreeNode node = new TreeNode(1);
		node.setLeft(new TreeNode(2));
		node.setRight(new TreeNode(3));

		// Left1 Node
		node.getLeft().setLeft(new TreeNode(4));
		node.getLeft().setRight(new TreeNode(5));

		// Right1 Node
		node.getRight().setLeft(new TreeNode(6));
		node.getRight().setRight(new TreeNode(7));
		
		return node;
	}
	
	public static List<TreeNode> findSubnodesWithSameChild(List<TreeNode> sameChildNodes, TreeNode node) {
		
		
		return sameChildNodes;
	}
}
