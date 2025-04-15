package javaDSA;

public class CountFrequencyOfArray {

	public static void main(String[] args) {
		int arr[] = {1,3,2,3,4,1,3};
		int freq[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		
		for(int i = 0; i < 10; i++) {
			if(freq[i] > 0) {
				System.out.println(i+" occurs "+freq[i]+" times ");
			}
		}
	}

}
