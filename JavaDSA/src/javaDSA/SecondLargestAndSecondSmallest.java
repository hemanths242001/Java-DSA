package javaDSA;

public class SecondLargestAndSecondSmallest {
	
	public static void secondLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println("the second largest number element: "+secondMax);
		
	}
	public static void secondSmallest(int arr[]) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				secondMin = min;
				min = arr[i];
			}
			else if(arr[i] < secondMin && arr[i] != min) {
				secondMin = arr[i];
			}
		}
		System.out.println("the second largest number element: "+secondMin);
	}

	public static void main(String[] args) {
		int arr[] = {23, 35, 12, 88, 67, 102, 1, 40};
		
		secondLargest(arr);
		secondSmallest(arr);
	}

}
