package javaDSA;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12};
		zeroesToEnd(nums);
		System.out.println(Arrays.toString(nums));
	}
	public static void zeroesToEnd(int nums[]) {
		int nonZeroIndex = 0;
		for(int i=0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}
		while(nonZeroIndex < nums.length) {
			nums[nonZeroIndex++] = 0;
		}
	}
}
