package javaDSA;

public class MergeSortArray {

	public static void main(String[] args) {
		int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		mergeSort(arr);
		
		for(int x : arr) {
			System.out.print(x+" ");
		}

	}
	// splitting function
	public static void mergeSort(int arr[]) {
		int length = arr.length;
		
		if(length <= 1) {
			return; //stops the splitting of array
		}
		
		int middle = length / 2;
		
		int leftArray[] = new int[middle];
		int rightArray[] = new int[length - middle];
		
		int i=0; //left array 
		int j = 0; //right array
		
		for(; i<length; i++) {
			if(i < middle) {
				leftArray[i] = arr[i];
			}
			else {
				rightArray[j] = arr[i];
				j++;
			}
		}
		//recursion
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(leftArray, rightArray, arr);
	}
	// merging function
	public static void merge(int leftArray[], int rightArray[], int arr[]) {
		int leftSize = arr.length/2;
		int rightSize = arr.length - leftSize;
		int i=0,l=0,r=0;
		// filling first half 
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				arr[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				arr[i] = rightArray[r];
				i++;
				r++;
			}
		}
		// filling second half
		while(l < leftSize) {
			arr[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			arr[i] = rightArray[r];
			i++;
			r++;
		}
	}
	
}
