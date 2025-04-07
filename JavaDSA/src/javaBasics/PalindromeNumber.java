package javaBasics;
import java.util.Scanner;

public class PalindromeNumber {
	
	static void palindrome(int n) {
		int temp = n;
		int rev = 0;
		while(n != 0) {
			int r = n % 10;
			rev  = rev * 10 + r;
			n = n / 10;
		}
		if(temp == rev) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		palindrome(num);
		sc.close();
	}

}
