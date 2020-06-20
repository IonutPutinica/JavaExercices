package ex7;
import java.util.Scanner;

public class Ex7 {
	public static void main(String args[])
	{
		int a;
		Scanner input=new Scanner(System.in);
		System.out.print("a = ");
		a=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a +" * " + i + " = "+ a*i);
		}
	}

}
