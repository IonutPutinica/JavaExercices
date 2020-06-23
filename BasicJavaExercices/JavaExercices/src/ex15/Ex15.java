package ex15;
import java.util.Scanner;

public class Ex15 {
	public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	String theString;
	int letters=0, spaces=0, numbers=0, other=0;
	System.out.print("Please input the string  = ");
	theString = input.nextLine();
	char[] ch= theString.toCharArray();
	for(int i=0; i<theString.length(); i++)
	{
		if(Character.isLetter(ch[i]))
		{
			letters++;
		}
		else if(Character.isDigit(ch[i]))
		{
			numbers++;
		}
		else if(Character.isSpaceChar(ch[i]))
		{
			spaces++;
		}
		else
		{
			other++;
		}
	}
	System.out.println("The string is =" +theString);
	System.out.println("letters = "+ letters);
	System.out.println("spaces = "+ spaces);
	System.out.println("number =  " + numbers);
	System.out.println("other =  " + other);
	}
	

}
