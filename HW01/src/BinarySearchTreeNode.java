import java.util.*;

public class BinarySearchTreeNode<T extends Comparable<T>> {
	
	private T element;
	private BinarySearchTreeNode<T> left;
	private BinarySearchTreeNode<T> right;
	
	public BinarySearchTreeNode() {
		element = null;
		left = right = null;
	}
	
	public BinarySearchTreeNode(T element) {
		this.element = element;
	}

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
	
	public boolean isleaf(BinarySearchTreeNode<T> node) {
		return node.getLeft() == null && node.getRight() == null;
	}
	
	public int getSize(BinarySearchTreeNode<T> node) {
		if (node == null) return 0;
		return getSize(node.getLeft()) + 1 + getSize(node.getRight()); 
	}
	
	public int getHeight(BinarySearchTreeNode<T> node) {
		if (node == null) return -1;
		int lefth = getHeight(node.getLeft());
		int righth = getHeight(node.getRight());
		return Math.max(lefth + 1, righth + 1);
	}
	
	public void preOrder(BinarySearchTreeNode<T> node) {
		if (node == null) return;
		System.out.print(node.getElement()+" ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	public void postOrder(BinarySearchTreeNode<T> node) {
		if (node == null) return;
		preOrder(node.getLeft());
		preOrder(node.getRight());
		System.out.print(node.getElement()+" ");
	}
	
	public int compareTo(BinarySearchTreeNode<T> other) {
		return other.getElement().compareTo(this.getElement());
	}
	

	
	
}
