package ex5;
import java.util.Scanner;

public class Ex5 {
	public static void main(String args[])
	{
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the value of a = ");
		a = input.nextInt();
		System.out.print("Input the value of b = ");
		b = input.nextInt();
		int product = a*b;
		System.out.println("The product of a and b is = "+ product);
	}

}
