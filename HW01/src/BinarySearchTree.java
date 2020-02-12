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
	
	//Get and set root
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
	
	//Return height of passed node, returns -1 if not in tree
	public int getHeight(BinarySearchTreeNode<T> target) {
		if (contains(root, target))
		return root.getHeight(target);
		else return -1;
	}
	
	//Returns depth of passed target node in tree from passed root, returns -1 if node is not contained in this tree
	public int getDepth(BinarySearchTreeNode<T> current, BinarySearchTreeNode<T> target) {
		if (!contains(root, target)) return -1;
		if (contains(current.getLeft(), target)) return getDepth(current.getLeft(), target) + 1;
		else if (contains(current.getRight(), target)) return getDepth(current.getRight(),target) + 1;
		else return 0;
	}
	
	//Display passed node's subtree in pre/post order if contained in this tree
	public void preOrder(BinarySearchTreeNode<T> target) {
		if (contains(root, target)) root.preOrder(target);
		else System.out.println("Error: Tree does not contian node");
	}
	public void postOrder(BinarySearchTreeNode<T> target) {
		if (contains(root, target)) root.postOrder(target);
		else System.out.println("Error: Tree does not contain node");
	}
	
	//Displays tree in pre/post order
	public void preOrder() {
		root.preOrder(root);
	}
	public void postOrder() {
		root.postOrder(root);
	}
	
	//Insert node to tree
	//TODO: subtree sort 
	/*public void insert(T element) {
		BinarySearchTreeNode<T> node = new BinarySearchTreeNode<T>(element);
		BinarySearchTreeNode<T> current = root;
		BinarySearchTreeNode<T> trail = null;
		while (current != null) {
			trail = current;
			if(current.compareTo(node) < 0) current = current.getLeft();
			else if(current.compareTo(node) > 0) current = current.getRight();
			else return;
		}
		if (trail == null) trail = node;
		else if (trail.compareTo(node) < 0) trail.setLeft(node);
		else if (trail.compareTo(node) > 0) trail.setRight(node);
		
	}*/
	
	//Searches passed tree for passed node 
	public boolean contains(BinarySearchTreeNode<T> current, BinarySearchTreeNode<T> target) {
		if (current == null || target == null) return false;
		if (current == target) return true;
		return contains(current.getLeft(), target) || contains(current.getRight(), target);
		
	}
	
	
	


	
	
	
	
}
