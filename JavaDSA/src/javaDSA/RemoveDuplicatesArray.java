package javaDSA;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,4,4};
		
		int newLength = removeDuplicates(arr);
		
		System.out.println("the new array length is: "+newLength);
		
		for(int i=0; i<newLength; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	// using fast slow pointers
	public static int removeDuplicates(int arr[]) {
		
		if(arr.length == 0) {
			return 0;
		}
		int i = 0;
		for(int j = 1; j < arr.length; j++){
			if(arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}

}
