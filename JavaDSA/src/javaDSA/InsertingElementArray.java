package javaDSA;
import java.util.Scanner;

public class InsertingElementArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("enter the elements of array");
		for(int i=0; i<size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("the elements are");
		for(int x: a) {
			System.out.print(x+",");
		}
		System.out.println("");
		//insertion
		System.out.println("enter the position to insert");
		int position = sc.nextInt();
		System.out.println("enter the element");
		int element = sc.nextInt();
		
		int b[] = new int[size+1];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
//		for(int z : b) {
//			System.out.print(z+" ");
//		}
		
		int max = b.length-1;
		
		for(int i = max; i > position; i--) {
			b[i] = b[i-1];
		}
		b[position] = element;
		a = b;
		System.out.println("the element is inserted successfully");
		for(int y : a) {
			System.out.print(y+" ");
		}
		sc.close();
	}

}
