package javaDSA;

public class DeletingElementArray {
	static int findElement(int arr[], int n, int key){
	    for(int i=0; i<n; i++) {
	    	if(arr[i] == key) {
	    		return i; // it returns 2
	    	}
	    }
	    return -1;
	}

	 // Function to delete an element
	 static int deleteElement(int arr[], int n, int key){
		 
	     int position = findElement(arr, n, key);
	     
	     if(position == -1) {
	    	 System.out.println("element not found");
	    	 return n;
	     }
	     
	     for(int i=position; i<n-1; i++) {
	    	 arr[i] = arr[i+1];
	     }
	     return n-1;
	 }

	 // Driver's Code
	 public static void main(String args[]){
		 int arr[] = {10,20,30,40,50};
	     int n = arr.length;
	     int key = 50;
	     
	     //before deletion of 30
	     
	     for(int x : arr) {
	    	 System.out.print(x+" ");
	     }
	     
	     n = deleteElement(arr, n, key);
	     
	     System.out.println("");
	     
	     for(int i=0; i<n; i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	 }
}

