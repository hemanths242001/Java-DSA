package javaDSA;

public class SumOfElementsArray {

	public static void main(String[] args) {
		int arr[] = {12,34,55,67,22,23};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("the sum is: "+sum);
	}

}
