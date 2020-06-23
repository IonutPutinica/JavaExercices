package ex14;
import java.util.Scanner;

public class Ex14 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String theStringToReversed;
		System.out.print("Please input the string to be reversed = ");
		theStringToReversed = input.nextLine();
		System.out.println("The string before reversion is = "+theStringToReversed);
		String reversedString="";
		for(int i=theStringToReversed.length()-1; i>=0; i--)
		{
			reversedString = reversedString + theStringToReversed.charAt(i);
		}
		System.out.println("The string after reversion is = " +reversedString);
	}

}
