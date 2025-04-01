package javaDSA;

public class MaxAndMinElementArray {

	public static void main(String[] args) {
		int A[] = {22,5,17,56,23,6,18};
		
		int max = A[0];
		int min = A[0];
		
		for(int i=0; i<A.length; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			if(A[i] < min) {
				min = A[i];
			}
		}
		System.out.println("the max element is: "+max);
		System.out.println("the min element is: "+min);
	}

}
