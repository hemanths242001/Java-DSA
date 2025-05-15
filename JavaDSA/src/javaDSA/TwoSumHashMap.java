package javaDSA;
import java.util.Map;
import java.util.HashMap;

public class TwoSumHashMap {
	
	public static int[] twoSumHashMaps(int nums[], int target) {
		Map<Integer, Integer> complements = new HashMap<> ();
		for(int i=0; i<nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			if(complementIndex != null) {
				return new int[] {i, complementIndex};
			}
			complements.put(target-nums[i], i);
		}
		
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int nums[] = {5,2,4};
		int target = 6;
		int result[] = twoSumHashMaps(nums, target);
		if(result[0] == -1) {
			System.out.println("the sum is not found");
		}
		else {
			System.out.println("the indices are: "+result[0]+","+result[1]);
		}
		
	}

}
