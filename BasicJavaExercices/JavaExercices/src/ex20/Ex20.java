package ex20;
import java.util.Scanner;
//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

public class Ex20 {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first integer = ");
		a=input.nextInt();
		System.out.print("Input the second integer = ");
		b=input.nextInt();
		System.out.print("Input the third integer = ");
		c=input.nextInt();
		int sum=a+b;
		if(c==sum)
		{
			System.out.println("The sum of the first 2 integers is equal to the value of the third one");
			
		}
		else
		{
			System.out.println("The sum of the first 2 integers is not equal to the value of the third one");
		}
		
	}

}
