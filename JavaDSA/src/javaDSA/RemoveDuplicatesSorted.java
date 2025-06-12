package javaDSA;

import java.util.Arrays;

public class RemoveDuplicatesSorted {

	public static void main(String[] args) {
		int nums[] = {1,2,3,3,3,4,4};
		int k = removeDuplicates(nums);
		System.out.println(k);
		
		
		while(k < nums.length) {
			nums[k++] = 1;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		
		return i + 1;
		
        
    }

}
