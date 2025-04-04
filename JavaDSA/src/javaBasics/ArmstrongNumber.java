package javaBasics;
import java.util.Scanner;

public class ArmstrongNumber {
	
	static void checkArmstrong(int num) {
		int temp = num;
		int sum = 0;
		int r;
		while(num > 0) {
			r = num % 10;
			sum = sum + r*r*r;
			num = num / 10;
		}
		if(temp == sum) {
			System.out.println(sum+" is a armstrong number");
		}
		else {
			System.out.println(sum+" is not a armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		checkArmstrong(num);
		sc.close();
	}

}
