package 第三次作业;
import java.util.Scanner;
public class e7 {
	public static void main(String[] args) {
		double x,y;
		System.out.print("Enter a point with two coordinates:");
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		if((x>=-5 && x<=5) && (y>=-2.5 && y<=2.5))
			System.out.println("Point " + "(" + x + "," + y + ")" + " is in the rectangle");
		else
			System.out.println("Point " + "(" + x + "," + y + ")" + " is not in the rectangle");
		input.close();

	}

}
