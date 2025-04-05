package javaBasics;
import java.util.Scanner;

public class PalindromeCase {
	
	public static void palindrome(String str) {
		String temp = str;
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(temp.equals(rev)) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("enter the string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		palindrome(str);
		sc.close();
		
	}

}
