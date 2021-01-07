package 第三次作业;
import java.util.Scanner;
public class e10 {

	public static void main(String[] args) {
		double x1, y1, w1, h1;
		double x2, y2, w2, h2;
		
		double Lx1, Ly1;
		double LBx1, LBy1;
		double Rx1, Ry1;
		double RBx1,RBy1;

		double Lx2, Ly2;
		double LBx2, LBy2;
		double Rx2, Ry2;
		double RBx2, RBy2;
		
		System.out.print("Enter r1's center x-,y-coordinates,width,and height: ");
		Scanner input = new Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		w1 = input.nextDouble();
		h1 = input.nextDouble();
		
		Lx1 = x1 - w1 / 2;
		Ly1 = y1 + h1 / 2;
		
		LBx1 = x1 - w1 / 2;
		LBy1 = y1 - h1 / 2;
		
		Rx1 = x1 + w1 / 2;
		Ry1 = y1 + h1 / 2;
		
		RBx1 = x1 + w1 / 2;
		RBy1 = y1 - h1 / 2;
		
		System.out.print("Enter r2's center x-,y-coordinates,width,and height: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		w2 = input.nextDouble();
		h2 = input.nextDouble();
		
		Lx2 = x2 - w2 / 2;
		Ly2 = y2 + h2 / 2;
		
		LBx2 = x2 - w2 / 2;
		LBy2 = y2 - h2 / 2;
		
		Rx2 = x2 + w2 / 2;
		Ry2 = y2 + h2 / 2;
		
		RBx2 = x2 + w2 / 2;
		RBy2 = y2 - h2 / 2;
		
		if(w1 * h1 >= w2 * h2)
		{
			if((Lx2>=Lx1 && Lx2<=Rx1 && Ly2>=LBy1 && Ly2<=Ry1) && (LBx2>=Lx1 && LBx2<=Rx1 && LBy2>=LBy1 && LBy2<=Ry1) 
					&& (Rx2>=Lx1 && Rx2<=Rx1 && Ry2>=LBy1 && Ry2<=Ry1) && (RBx2>=Lx1 && RBx2<=Rx1 && RBy2>=LBy1 && RBy2<=Ry1)){
				System.out.println("r2 is inside r1");
			}
			else if((Lx2>=Lx1 && Lx2<=Rx1&& Ly2>=LBy1 && Ly2<=Ry1)||(LBx2>=Lx1 && LBx2<=Rx1	&& LBy2>=LBy1 && LBy2<=Ry1)
				|| (Rx2>=Lx1 && Rx2<=Rx1&& Ry2>=LBy1 && Ry2<=Ry1)||(RBx2>=Lx1 && RBx2<=Rx1 && RBy2>=LBy1 && RBy2<=Ry1))
			{
				System.out.println("r2 overlaps r1");
			}
			else
			{
				System.out.println("r2 does not overlap r1");
			}
		}
		else
		{
			if((Lx1>=Lx2 && Lx1<=Rx2 && Ly1>=LBy2 && Ly1<=Ry2)&&(LBx1>=Lx2 && LBx1<=Rx2	&& LBy1>=LBy2 && LBy1<=Ry2)&&(Rx1>=Lx2 && Rx1<=Rx2
					&& Ry1>=LBy2 && Ry1<=Ry2)&&(RBx1>=Lx2 && RBx1<=Rx2 && RBy1>=LBy2 && RBy1<=Ry2))
			{
				System.out.println("r1 is inside r2");
			}
			else if((Lx1>=Lx2 && Lx1<=Rx2 && Ly1>=LBy2 && Ly1<=Ry2)||(LBx1>=Lx2 && LBx1<=Rx2 && LBy1>=LBy2 && LBy1<=Ry2)
				||(Rx1>=Lx2 && Rx1<=Rx2 && Ry1>=LBy2 && Ry1<=Ry2)||(RBx1>=Lx2 && RBx1<=Rx2 && RBy1>=LBy2 && RBy1<=Ry2))
			{
				System.out.println("r1 overlaps r2");
			}
			else
			{
				System.out.println("r1 does not overlap r2");
			}
		}
		input.close();
	}

}
