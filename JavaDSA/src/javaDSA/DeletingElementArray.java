package javaDSA;
import java.util.Scanner;

public class DeletingElementArray {
	static int findElement(int arr[], int n, int key){
	    for(int i=0; i<n; i++) {
	    	if(arr[i] == key) {
	    		return i; // it returns position
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
		 int arr[] = {10,20,30,40,50,60,70};
	     int n = arr.length;
	     for(int x : arr) {
	    	 System.out.print(x+" ");
	     }
	     System.out.println("");
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter the key to delete");
	     int key = sc.nextInt();
	     
	     //before deletion
	     
	     
	     n = deleteElement(arr, n, key);
	     
	     System.out.println("");
	     
	     for(int i=0; i<n; i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	     sc.close();
	 }
}

