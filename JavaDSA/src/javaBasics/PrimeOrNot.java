package javaBasics;
import java.util.Scanner;

public class PrimeOrNot {
	
	static void primeNumber(int n) {
		boolean flag = true;
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.println(n+ " is a prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		num = sc.nextInt();
		primeNumber(num);
		sc.close();
		
	}

}
