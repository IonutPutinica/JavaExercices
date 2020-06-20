package ex10;
import java.util.Scanner;

public class Ex10 {
	public static void main(String args[])
	{
		double height, width;
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the height of the rectangle = ");
		height=input.nextDouble();
		System.out.print("Please input the width of the rectangle = ");
		width=input.nextDouble();
		double perimeter = 2 * (height + width);
		double area = height * width;
		System.out.println("The perimeter of the rectangle is "  +perimeter);
		System.out.println("The area of the rectangle is " +  +area);
		
	}

}
