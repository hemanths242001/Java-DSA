package javaDSA;

public class LinearSearchArray {
	
	static int search(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25};
		int key = 15;
		
		int index = search(arr, key);
		
		if(index != -1) {
			System.out.println(key+" found at the index of "+index);
		}
		else {
			System.out.println("the element is not found");
		}
	}

}
