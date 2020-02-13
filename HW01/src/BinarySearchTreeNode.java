//Finn Jacobs
import java.util.*;
public class BinarySearchTreeNode<T extends Comparable<T>> {
	
	//Class variables
	private T element;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	
	//Constructors
	public BinarySearchTreeNode() {
		element = null;
		left = right = null;
	}
	
	public BinarySearchTreeNode(T element) {
		this.element = element;
	}
	
	//Return size of passed node
	public int getSize(BinarySearchTreeNode<T> node) {
		if (node == null) return 0;
		return getSize(node.getLeft()) + 1 + getSize(node.getRight()); 
	}
	
	//Return height of passed node
	public int getHeight(BinarySearchTreeNode<T> node) {
		if (node == null) return -1;
		int lefth = getHeight(node.getLeft());
		int righth = getHeight(node.getRight());
		return Math.max(lefth + 1, righth + 1);
	}
	
	//Preorder display of passed node and descendants
	public void preOrder(BinarySearchTreeNode<T> node) {
		if (node == null) return;
		System.out.print(node.getElement()+" ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	//Postorder display of passed node and descendants
	public void postOrder(BinarySearchTreeNode<T> node) {
		if (node == null) return;
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getElement()+" ");
	}
	
	//Returns true if target node is a descendant of passed node
	public boolean contains(BinarySearchTreeNode<T> current, BinarySearchTreeNode<T> target) {
		if (current == target) return true;
		if (current == null || target == null) return false;
		return (contains(current.getLeft(), target) || contains(current.getRight(), target));
	}
	
	//Comparator
	public int compareTo(BinarySearchTreeNode<T> other) {
		return other.getElement().compareTo(this.getElement());
	}
	
	//Getters/Setters
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public BinarySearchTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode<T> left) {
		this.left = left;
	}

	public BinarySearchTreeNode<T> getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode<T> right) {
		this.right = right;
	}
	
}
