package javaDSA;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = {12,8,56,23,34};
		
		int left = 0, right = arr.length - 1;
		while (left < right) {
		    // Swap elements
		    int temp = arr[left];
		    arr[left] = arr[right];
		    arr[right] = temp;

		    left++;
		    right--;
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
