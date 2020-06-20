package ex12;
import java.util.Scanner;

public class Ex12 {
	public static void main(String args[])
	{
		//compare 2 numbers
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the value of a = ");
		a=input.nextInt();
		System.out.print("Input the value of b = ");
		b=input.nextInt();
		if(a==b)
		{
			System.out.println("a equals b");
		}
		if(a>b)
		{
			System.out.println("The value of a is greater than the value of b");	
		}
		else
			if(b>a)
		{
			System.out.println("The value of b is greater than a");
		}
	}

}
