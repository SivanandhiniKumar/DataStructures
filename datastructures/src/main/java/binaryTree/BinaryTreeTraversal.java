package binaryTree;

public class BinaryTreeTraversal extends BinaryTree{

	public BinaryTreeTraversal(Node node) {
		super(node);
	}

	void preOrderTraversal() {
		preOrderTraversal(root);
	}
	
	void preOrderTraversal(Node n) {
		if(n != null)
		{
			System.out.println(n.key);
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}
	}
	
	void postOrderTraversal() {
		postOrderTraversal(root);
	}
	
	void postOrderTraversal(Node n) {
		if(n != null)
		{
			postOrderTraversal(n.left);
			postOrderTraversal(n.right);
			System.out.println(n.key);
		}
	}
	
	void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	void inOrderTraversal(Node n) {
		if(n != null)
		{
			inOrderTraversal(n.left);
			System.out.println(n.key);
			inOrderTraversal(n.right);
		}
	}
}
