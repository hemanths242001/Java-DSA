package javaBasics;

import java.util.Scanner;

public class FibonacciRecursion {
	
	private static long fibonacciCache[];
	
	public static long fib(int n) {
		if(n <= 1) {
			return n;
		}
		// memoization 
		long nthFibonacciNumber = (fib(n-1)+fib(n-2));
		fibonacciCache = new long [n + 1];
		fibonacciCache[n] = nthFibonacciNumber;
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
			//Primitives can never be assigned 'null', instead, they will default to 0.
		}
		return nthFibonacciNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int n = scanner.nextInt(); 
        
//        fibonacciCache = new long [n + 1];
        
        for(int i=0; i<n; i++) {
        	System.out.print(fib(i)+" ");
        }
        scanner.close();
	}
//	int n = 10;
//	int[] arr = new int[n]; // Creates an array of size 10, initialized to 0 by default.
//	arr[1] = 1; // Sets the second element (index 1) of the array to 1.
//	for (int i = 2; i < n; i++) { // Iterates from index 2 to index 9 (n-1).
//	    arr[i] = arr[i - 1] + arr[i - 2]; // Each element is the sum of the two previous elements.
//	}
//	System.out.println(Arrays.toString(arr)); // Prints the array.

}
