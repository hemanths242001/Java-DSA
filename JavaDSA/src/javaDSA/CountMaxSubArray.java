package javaDSA;
import java.util.Map;
import java.util.HashMap;

public class CountMaxSubArray {

	public static void main(String[] args) {
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int k = 3; //count sub array with sum is equal to k
		System.out.println(countSubArray(arr, k));
	}
	public static int countSubArray(int arr[], int k) {
		int sum = 0, count = 0;
		HashMap<Integer, Integer> myMap = new HashMap <> ();
		myMap.put(0, 1);
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
			if(myMap.containsKey(sum - k)) {
				count = count + myMap.get(sum - k);
			}
			
			myMap.put(sum, myMap.getOrDefault(sum, 0)+1);
		}
		return count;
	}
}
