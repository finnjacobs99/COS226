
public class Tester {

	public static void main(String[] args) {
		
		BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<Integer>(30);
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(root);
		
		BinarySearchTreeNode<Integer> node1 = new BinarySearchTreeNode<Integer>(20);
		BinarySearchTreeNode<Integer> node2 = new BinarySearchTreeNode<Integer>(10);
		BinarySearchTreeNode<Integer> node3 = new BinarySearchTreeNode<Integer>(40);
		BinarySearchTreeNode<Integer> node4 = new BinarySearchTreeNode<Integer>(40);
		
		root.setLeft(node1);
		node1.setLeft(node2);
		node2.setRight(node3);
		System.out.println(tree.getDepth(root, node3));
		
		
	}

}
