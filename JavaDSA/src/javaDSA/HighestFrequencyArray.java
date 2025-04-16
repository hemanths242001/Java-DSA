package javaDSA;

public class HighestFrequencyArray {

	public static void main(String[] args) {
		int arr[] = {12, 33, 56, 56, 98, 98, 56, 33, 87, 64, 12, 20};
		int freq[] = new int[101];	
		
		for(int i=0; i<arr.length; i++) {
			freq[arr[i]]++;
		}
		
		int maxFreq = 0, number = -1;
		for(int i=0; i<101; i++) {
			if(freq[i] > maxFreq) {
				maxFreq = freq[i];
				number = i;
			}
		}
		System.out.println("the highest Frequency number is: "+number);
	}

}
