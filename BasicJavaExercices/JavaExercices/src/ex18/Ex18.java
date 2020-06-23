package ex18;
import java.util.Scanner;
// Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. 
public class Ex18 {
	public static void main(String args[])
	{
		int integer;
		Scanner input= new Scanner(System.in);
		System.out.print("Please input your integer = ");
		integer=input.nextInt();
		if(integer%2==0)
		{ 
		System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}

}
