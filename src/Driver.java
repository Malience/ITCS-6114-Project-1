import java.util.Random;

public class Driver {
	public static void main(String [] args) {
		Random r = new Random();
		
		BinarySearchTree bst = new BinarySearchTree();
		
		for(int i = 0; i < 500; i++) bst.insert(r.nextInt(100) + 1);
		
		System.out.println(bst.height);
		System.out.println(bst.avgKeyComparison());
		
		bst = new BinarySearchTree();
		
		for(int i = 1; i < 100; i+=2) bst.insert(i);
		for(int i = 2; i < 101; i+=2) bst.insert(i);
		for(int i = 0; i < 400; i++) bst.insert(r.nextInt(100) + 1);
		
		System.out.println(bst.height);
		System.out.println(bst.avgKeyComparison());
	}
}
