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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		oddOrEven(num);

        while(true)
        {
            if(num>0)
            {
                System.out.println("Enter again: ");
                num = sc.nextInt();
                oddOrEven(num);
            }
            else
            {
                System.out.println("Number is negative! System Shutdown!");
                System.exit(1);
                sc.close();
            }

        }
	}

}
