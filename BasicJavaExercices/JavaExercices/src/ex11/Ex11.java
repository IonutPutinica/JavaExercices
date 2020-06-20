package ex11;
import java.util.Scanner;

public class Ex11 {
	public static void main(String args[])
	{
		int a,b;
		int swap;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the value of a = ");
		a=input.nextInt();
		System.out.print("Input the value of b = ");
		b=input.nextInt();
		swap=a;
		a=b;
		b=swap;
		System.out.println("The new value of a is = "+a);
		System.out.println("The new value of b is = "+b);
	}

}
