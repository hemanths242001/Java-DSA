package javaDSA;
import java.math.*;

public class LengthOfLongestSubArray {

	public static void main(String[] args) {
		int arr[] = {4, 1, 1, 1, 2, 3, 5};
		
		int k = 5; // the length of sub array where their sum should be less than or equal to k 
		
		System.out.println(maxLengthSubArray(arr, k));
		
	}
	public static int maxLengthSubArray(int arr[], int k) {
		int left = 0;
		int currentSum = 0;
		int maxLength = 0;
		
		int n = arr.length;
		
		for(int right = 0; right < n; right++) {
			currentSum = currentSum + arr[right];
			
			if(currentSum > k) {
				currentSum = currentSum - arr[left];
				left++;
			}
			
			maxLength = Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}
