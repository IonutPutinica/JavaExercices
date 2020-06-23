package ex21;
import java.util.Scanner;
// Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative

public class Ex21 {
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
		//count has the measure of keeping track of how many times the right most digit is equal on any of the numbers
		int count=0;
		if(a%10==b%10)
			count++;
		if(a%10==c%10)
			count++;
		if(b%10==c%10)
			count++;
		if(count!=0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		

}
}
