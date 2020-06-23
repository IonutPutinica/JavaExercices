package ex19;
import java.util.Scanner;
//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both

public class Ex19 {
	public static void main(String args[])
	{
		System.out.print("The numbers that can be devided by 3 are =");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println("");
		System.out.print("The numbers that can be devided by 5 are =");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println("");
		System.out.print("The numbers that can be devided by both 3 and 5 are =");
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
