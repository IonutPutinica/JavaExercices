package ex8;
import java.util.Scanner;

public class Ex8 {
	public static void main(String args[])
	{
		float radius;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the radius of the circle = ");
		radius = input.nextFloat();
		float perimeter = (float) (2*Math.PI*radius);
		float area = (float) (Math.PI*radius*radius);
		System.out.println("The perimeter of the circle with the radius of " + radius + " is = " +perimeter);
		System.out.println("The area of the circle with the radius of " + radius + " is = " +area);
	}

}
