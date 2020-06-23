package ex23;
//Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
import java.util.Scanner;

public class Ex23 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int x,y,p;
		System.out.print("Insert the lower limit of the range = ");
		x=input.nextInt();
		System.out.print("Insert the upper limit of the range = ");
		y=input.nextInt();
		System.out.print("Insert the number to check the divisibility for = ");
		p=input.nextInt();
		int count=0;
		for(int i=x;i<=y;i++)
		{
			if(i%p==0)
				count++;
		}
		System.out.println("The number of integers in the "+x+" "+y+" range, that is divisible by "+p +" is = "+count);
	}

}
