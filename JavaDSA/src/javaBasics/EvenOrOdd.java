package javaBasics;
import java.util.Scanner;

public class EvenOrOdd {

	static public void oddOrEven(int num){
		if(num % 2 == 0) {
			System.out.println(num+" is a even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		oddOrEven(num);
		sc.close();
	}

}
