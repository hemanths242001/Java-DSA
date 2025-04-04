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

}
