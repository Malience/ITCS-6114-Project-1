import java.util.Stack;

public class BinarySearchTree {
	Node root;
	int height;

	public void insert(int key) {
		if(root == null) {
			root = new Node(key);
			height = 1;
			return;
		}
		int depth = 1;
		Node n = root;
		while(true) {
			if(n.key == key) {
				n.count++;
				return;
			}
			depth++;
			if(key > n.key) {
				if(n.right == null) {
					n.right = new Node(key);
					if(depth > height) height = depth;
					return;
				}
				n = n.right;
			}
			else {
				if(n.left == null) {
					n.left = new Node(key);
					if(depth > height) height = depth;
					return;
				}
				n = n.left;
			}
		}
	}
	
	public float avgKeyComparison() {
		Stack<Node> current = new Stack<Node>();
		Stack<Node> next = new Stack<Node>();
		int total = 0;
		int comparisons = 0;
		int depth = 1;
		current.push(root);
		Node n;
		do {
			while(!current.isEmpty()) {
				n = current.pop();
				if(n.left != null) next.push(n.left);
				if(n.right != null) next.push(n.right);
				total += n.count;
				comparisons += n.count * depth;
			}
			Stack<Node> swap = current;
			current = next;
			next = swap;
			depth++;
		} while(!current.isEmpty());
		
		return (float) comparisons / (float) total;
	}
	
	private static class Node {
		Node left, right;
		int key, count;
		Node(int key) {
			this.key = key; 
			this.count = 1;
		}
	}
}
