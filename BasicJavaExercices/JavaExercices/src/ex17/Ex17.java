package ex17;
//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line

public class Ex17 {
	public static void main(String args[])
	{
		System.out.println("The odd numbers from 1 to 99 are = ");
		for(int i=1;i<=99;i++)
		{
			if(i%2==1)
				System.out.println(i);
		}
	}

}
