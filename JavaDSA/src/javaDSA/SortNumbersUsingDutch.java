package javaDSA;

import java.util.Arrays;

public class SortNumbersUsingDutch {

	public static void main(String[] args) {
		int arr[] = {2,0,2,1,1,0};
		sortColors(arr);
		System.out.println(Arrays.toString(arr));
	}
	// sorting using dutch national flag algorithm due to constraints
	public static void sortColors(int arr[]) {
		int low = 0, mid = 0, high = arr.length - 1;
		while(mid <= high) {
			if(arr[mid] == 0) {
				int temp1 = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp1;
				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				int temp2 = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp2;
				high--;
			}
		}
	}

}
