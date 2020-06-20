package ex6;
import java.util.Scanner;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

public class Ex6 {
	public static void main(String args[])
	{
		int a,b;
		int sum, product, substract, division, remainder;
		Scanner input=new Scanner(System.in);
		System.out.print("Please input the value of a = ");
		a=input.nextInt();
		System.out.print("Please input the value of b = ");
		b=input.nextInt();
		sum = a+b;
		System.out.println("Sum of a and b = "+ sum);
		product = a*b;
		System.out.println("Product of a and b = "+ product);
		substract = a-b;
		System.out.println("Difference of a and b = "+ substract);
		division = a/b;
		System.out.println("Division of a and b = "+ division);
		remainder= a%b;
		System.out.println("Remainder of a and b = "+ remainder);
		
	}

}
