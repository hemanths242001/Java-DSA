package javaDSA;

public class MajorityElementArray {

	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}
	
	public static int majorityElement(int arr[]) {
		int count = 0;
		int candidate = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(count == 0) {
				candidate = arr[i];
			}
			count +=(candidate == arr[i]) ? 1 : -1;
		}
		//verification
		count = 0;
		for(int num : arr) {
			if(num == candidate) {
				count++;
			}
		}
		return (count > arr.length / 2) ? candidate : -1;
	}

}
