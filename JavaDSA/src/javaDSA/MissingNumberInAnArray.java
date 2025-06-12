package javaDSA;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		int[] nums = {8, 2, 4, 5, 3, 7, 1};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int n = nums.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
        	sum += num;
    	}
        int number = total - sum;
        return number;
	}
	// should check xor operator based method(bitwise operations - bit manipulations)
}
