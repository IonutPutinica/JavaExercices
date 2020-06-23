package ex16;
import java.util.Scanner;
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn

public class Ex16 {
	public static void main(String args[])
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Please input your integer = ");
		n=input.nextInt();
		int newFormat=0;
		newFormat=n*100+n*10+n;
		System.out.println("The number under the n+nn+nnn format is = "+newFormat);
	}

}
