package javaBasics;
import java.util.Scanner;

public class FactorialProgram {
	
	static int factorialNormal(int n) {
		int res = 1;
		for(int i=2; i<=n; i++) {
			res = res * i;
		}
		return res;
	}
	static int factorialRecursive(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorialRecursive(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(factorialNormal(num));
		System.out.println("recursive answer:-");
		System.out.println(factorialRecursive(num));
		sc.close();
	}
	

}
