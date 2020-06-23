package ex22;
import java.util.Scanner;
//Write a Java program to convert seconds to hour, minute and seconds. 

public class Ex22 {
	public static void main(String args[])
	{
		int seconds;
		int hourCount=0,minuteCount=0,secondCount=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of seconds to be converted = ");
		seconds=input.nextInt();
		if(seconds>=3600)
		{
		while(seconds>=3600)
		{
			hourCount=hourCount+1;
			seconds=seconds-3600;
		}
		if(seconds>=60)
		{
			while(seconds>=60)
			{
				minuteCount=minuteCount+1;
				seconds=seconds-60;
			}
		}
		secondCount=seconds;
		}
		System.out.println("Number of hours = " + hourCount);
		System.out.println("Number of minutes = " + minuteCount);
		System.out.println("Number of seconds = " + secondCount);
		System.out.println(hourCount+ ":"+minuteCount+":"+secondCount);
		
	}

}
