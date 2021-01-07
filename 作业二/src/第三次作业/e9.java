package 第三次作业;
import java.util.Scanner;
public class e9 {
	public static void main(String[] args) {
		double x,y;
		System.out.print("Enter a point's x- and y-coordinates: ");
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		
		if(x!=200)
		{
			if((-0.5<=-1*y/(200-x) && -1*y/(200-x)<=0) && (x>=0 && x<200))
				System.out.println("The point is in the triangle");
			else
				System.out.println("The point is not in the triangle");
		}
		else
		{
			if(y!=0)
				System.out.println("The point is not in the triangle");
			else
				System.out.println("The point is in the triangle");
		}
		input.close();
	}
}
