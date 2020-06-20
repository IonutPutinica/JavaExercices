package ex9;
import java.util.Scanner;

public class Ex9 {
	
	public static void main(String args[])
	{
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the value of a = ");
		a=input.nextInt();
		System.out.print("Input the value of b = ");
		b=input.nextInt();
		System.out.print("Input the value of c = ");
		c=input.nextInt();
		float average = (float) (a+b+c)/3;
		System.out.println("The average of the three numbers is = "+average);
	}

}
