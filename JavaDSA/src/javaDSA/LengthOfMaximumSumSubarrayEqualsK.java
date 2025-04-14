package javaDSA;
import java.util.HashMap;
import java.util.Map;

public class LengthOfMaximumSumSubarrayEqualsK {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -2, 5};
		int k = 6;
		System.out.println(longestSubarraySumK(arr, k));  
	}
	public static int longestSubarraySumK(int arr[], int k) {
		int sum = 0;
		int maxLen = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
			if(sum == k) {
				maxLen = i+1;
			}
			
			if(hm.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i-hm.get(sum - k));
			}
			
			if(!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
		}
		return maxLen;
	}

}
