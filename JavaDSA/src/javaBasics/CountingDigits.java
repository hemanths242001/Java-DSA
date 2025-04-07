package javaBasics;
import java.util.Scanner;

public class CountingDigits {
	
	static int countDigits(int n) {
		int count = 0;
		while(n > 0) {
			n = n/10;
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println("the number has "+countDigits(num)+" Digits");
		sc.close();
	}

}
