package javaDSA;

public class BubbleSortArray {

	public static void main(String[] args) {
		int arr[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x+" "); 
		}
	}

}
