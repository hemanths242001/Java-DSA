package javaDSA;

public class NumberOfDuplicatesArray {
	public static void main(String args[]) {
		int arr[] = {12, 33, 56, 56, 98, 98, 56, 33, 87, 64, 12, 20};
		int freq[] = new int[101];	
		
		for(int i=0; i<arr.length; i++) {
			freq[arr[i]]++;
		}
		
		int duplicates = 0;
		for(int f : freq) {
			if(f > 1) {
				duplicates++;
			}
		}
		
		System.out.println("the number of duplicates are: "+duplicates);
	}
}
