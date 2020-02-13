//Finn Jacobs
public class Tester {

	public static void main(String[] args) {
		
		//Create root, nodes, and populate binary search tree
		BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<Integer>(10);
		BinarySearchTreeNode<Integer> node1 = new BinarySearchTreeNode<Integer>(6);
		BinarySearchTreeNode<Integer> node2 = new BinarySearchTreeNode<Integer>(12);
		BinarySearchTreeNode<Integer> node3 = new BinarySearchTreeNode<Integer>(4);
		BinarySearchTreeNode<Integer> node4 = new BinarySearchTreeNode<Integer>(8);
		BinarySearchTreeNode<Integer> node5 = new BinarySearchTreeNode<Integer>(5);
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(root);
				
		
								//					10
		root.setLeft(node1);	//	Tree		   /  \
		root.setRight(node2);	//	Contents:	  6    12
		node1.setLeft(node3);	//				 / \
		node1.setRight(node4);	//				4	8
		node3.setRight(node5);  //			     \
								//			      5
		
		
		System.out.println("Tree size: " + tree.getSize());
		System.out.println("Tree height: " + tree.getHeight());
		System.out.print("Preorder contents: "); tree.preOrder();
		System.out.print("Postorder contents: "); tree.postOrder();
		System.out.println("Height of node 1 (6): " + tree.getHeight(node1));
		System.out.println("Depth of node 5 (5): " + tree.getDepth(root, node5));
		System.out.print("Preorder contents of node 1 (6): "); tree.preOrder(node1);
		System.out.print("Postorder contents of node 1 (6): "); tree.postOrder(node1);
		
		
		node1.setLeft(null); //Detach left subtree of node1 (6)
		
		//				 10
		//	Tree	    /  \
		//	Contents:  6    12
		//			    \
		//			     8
		
		//Node specific methods fail when called on node3 & it's descendants
		System.out.println("Height of node 1 (6): " + tree.getHeight(node1)); 			//Still a descendant
		System.out.println("Height of node 3 (4): " + tree.getHeight(node3)); 			//**No longer a descendant
		System.out.println("Depth of node 4 (8): " + tree.getDepth(root, node4));		//Still a descendant
		System.out.println("Depth of node 5 (5): " + tree.getDepth(root, node4));		//**No longer a descendant
		System.out.print("Preorder contents of node 3 (4): "); tree.preOrder(node3);	//**No longer a descendant
		System.out.print("Postorder contents of node 3 (4): "); tree.postOrder(node3);	//**No longer a descendant
		
		//  Removed		4
		//  Subtree:	 \
		//				  5
		
		//But can work if a new tree object is created from removed subtree
		BinarySearchTree<Integer> tree2 = new BinarySearchTree<Integer>(node3);
		System.out.print("Preorder contents of removed subtree: "); tree2.preOrder();
	}

}
