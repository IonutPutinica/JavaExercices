package ex13;
import java.util.Scanner;

public class Ex13 {
	public static void main(String args[])
	{
		int a;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the value of a = ");
		a=input.nextInt();
		int sum=0,temp;
		while(a!=0)
		{
			temp=a%10;
			sum+=temp;
			a=a/10;
		}
		System.out.println("The sum of the digits of a = "+sum);
	}

}
