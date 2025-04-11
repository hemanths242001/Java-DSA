package javaDSA;

public class BinarySearchOccurrences {

	public static void main(String[] args) {
		int arr[] = {2, 4, 4, 4, 4, 6, 8};
		int target = 4;
		
		System.out.println("First Occurrence: "+firstOccurrence(arr, target));
		System.out.println("Last Occurrence: "+lastOccurrence(arr,target));
		
	}
	public static int firstOccurrence(int arr[], int target) {
		
		int low = 0; // start index
		int high = arr.length-1; // end index
		int result = -1;
		
		while(low <= high) {
			int middle = low + (high-low) / 2;
			int value = arr[middle];
			
			if(value < target) {
				low = middle + 1;
			}
			else if(value > target) {
				high = middle - 1;
			}
			else {
				result = middle;
				high = middle - 1;
			}
		}
		return result; 
	}
	public static int lastOccurrence(int arr[], int target) {
		
		int low = 0; // start index
		int high = arr.length-1; // end index
		int result = -1;
		
		while(low <= high) {
			int middle = low + (high-low) / 2;
			int value = arr[middle];
			
			if(value < target) {
				low = middle + 1;
			}
			else if(value > target) {
				high = middle - 1;
			}
			else {
				result = middle;
				low = middle + 1;
			}
		}
		return result; 
	}
}
