//Finn Jacobs
public class BinarySearchTree<T extends Comparable<T>> {
	
	private BinarySearchTreeNode<T> root;
	
	//Constructors
	public BinarySearchTree() {
		root = null;
	}
	
	public BinarySearchTree(BinarySearchTreeNode<T> root) {
		this.root = root;
	}
	
	//Getters/Setters
	public BinarySearchTreeNode<T> getRoot() {
		return root;
	}
	
	public void setRoot(BinarySearchTreeNode<T> root) {
		this.root = root;
	}
	
	//Return size of root
	public int getSize() {
		return root.getSize(root);
	}
	
	//Return height of root
	public int getHeight() {
		return root.getHeight(root);
	}
	
	//Preorder display of root's descendants
	public void preOrder() {
		root.preOrder(root);
		System.out.println("");
	}
	
	//Postorder display of root's descendants
	public void postOrder() {
		root.postOrder(root);
		System.out.println("");
	}
	
	//Returns true if passed node is a descendant of root
	public boolean contains(BinarySearchTreeNode<T> current, BinarySearchTreeNode<T> target) {
		if (current == target) return true;
		if (current == null || target == null) return false;
		return contains(current.getLeft(), target) || contains(current.getRight(), target);
	}
	
	//Return height of passed node, returns -1 if not a descendant of root
	public int getHeight(BinarySearchTreeNode<T> target) {
		if (contains(root, target))
		return root.getHeight(target);
		else return -1;
	}
	
	//Return depth of passed node, returns -1 if not a descendant of root
	public int getDepth(BinarySearchTreeNode<T> current, BinarySearchTreeNode<T> target) {
		if (!contains(root, target)) return -1;
		
		if (contains(current.getLeft(), target)) return getDepth(current.getLeft(), target) + 1;
		
		else if (contains(current.getRight(), target)) return getDepth(current.getRight(), target) + 1;
		
		else return 0;
	}
	
	//Preorder display of passed subtree of root, prints error if not a subtree of root
	public void preOrder(BinarySearchTreeNode<T> target) {
		if (contains(root, target)) {
			root.preOrder(target);
			System.out.println("");
		}
		else System.out.println("Error: Tree does not contian target");
	}
	
	//Postorder display of passed subtree of root, prints error if not a subtree of root
	public void postOrder(BinarySearchTreeNode<T> target) {
		if (contains(root, target)) {
			root.postOrder(target);
			System.out.println("");
		}
		else System.out.println("Error: Tree does not contain target");
	}
	
}
