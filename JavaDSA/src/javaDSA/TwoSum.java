package javaDSA;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = {3,2,4};
		int target = 6;
		Arrays.sort(arr);
		
		int result[] = twoSumIndices(arr, target);
		
		if(result[0] == -1) {
			System.out.println("the sum is not found");
		}
		else {
			System.out.println("the indices are: "+result[0]+","+result[1]);
		}
		
	}
	public static int[] twoSumIndices(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return new int[] {left, right};
			}
			else if(sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		return new int[] {-1, -1};
	}
}
