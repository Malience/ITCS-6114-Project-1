package hardcore;

public class BinarySearchTreeHC {
	int[] values;
	
	public BinarySearchTreeHC(int size) {
		values = new int[size];
		for(int i = 0; i < size; i++) values[i] = -1;
	}
	
	public void insert(int value) {
		if(values[0] < 0) {
			values[0] = value;
			return;
		}
	}
	
}
