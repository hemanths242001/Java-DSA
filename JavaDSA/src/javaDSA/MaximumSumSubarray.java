package javaDSA;
import java.math.*;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 1, 3, 2, -10, 9, 6};
		int k = 3;
		int n = arr.length;
		
		int windowSum = 0, maxSum = 0;
		
		for(int i=0; i<k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		
		for(int i = k; i < n; i++) {
			windowSum += arr[i] - arr[i-k]; 
			maxSum = Math.max(windowSum, maxSum);
		}		
		System.out.println("the maximum of an subarray: "+maxSum);
		
	}

}
