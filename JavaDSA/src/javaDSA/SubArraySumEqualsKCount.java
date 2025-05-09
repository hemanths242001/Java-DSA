package javaDSA;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsKCount {
	
	public static int subArraySum(int arr[], int k) {
		Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);

        int runningSum = 0;
        int result = 0;

        for(int x : arr){
            runningSum += x;
            result += countMap.getOrDefault(runningSum-k, 0);
            countMap.put(runningSum, countMap.getOrDefault(runningSum, 0)+1);
        }
        return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,1,1};
		int k = 2;
		System.out.println(subArraySum(arr,k));
	}

}
