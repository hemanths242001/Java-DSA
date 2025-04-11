package javaDSA;
import java.util.Scanner;

public class BinarySearchArray {

	public static void main(String[] args) {
		int arr[] = new int[100];
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the target element");
		int target = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		int index = binarySearch(arr, target);
		
		if(index == -1) {
			System.out.println(target+" is not found");
		}
		else {
			System.out.println(target+" is found at "+index);
		}
		
		sc.close();
	}
	
	public static int binarySearch(int arr[], int target) {
		
		int low = 0; // start index
		int high = arr.length-1; // end index
		
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
				return middle;
			}
		}
		return -1; // if it is not found
	}

}
