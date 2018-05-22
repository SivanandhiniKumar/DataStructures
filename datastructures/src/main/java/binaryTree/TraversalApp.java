package binaryTree;

public class TraversalApp {
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		
		BinaryTreeTraversal tree = new BinaryTreeTraversal(node1);
		
		System.out.println("PreOrderTraversal");
		tree.preOrderTraversal();
		
		System.out.println("PostOrderTraversal");
		tree.postOrderTraversal();
		
		System.out.println("InOrderTraversal");
		tree.inOrderTraversal();
	}
}
