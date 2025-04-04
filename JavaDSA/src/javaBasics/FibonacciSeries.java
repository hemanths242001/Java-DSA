package javaBasics;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int n = scanner.nextInt();        
        generateFibonacci(n);
        scanner.close();
    }

    public static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        
        while(firstTerm < n) {
        	System.out.print(firstTerm+" , ");
        	
        	int nextTerm = firstTerm + secondTerm;
        	firstTerm = secondTerm;
        	secondTerm = nextTerm;
        }
    }
}
