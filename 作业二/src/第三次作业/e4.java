package 第三次作业;
import java.util.Scanner;
public class e4 {

	public static void main(String[] args) {
double a,b,c,s=0;
		
		// Prompt the user to enter three edges
		System.out.print("输入三角形的三条边: ");
		Scanner input = new Scanner(System.in);
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		if(a+b>c && a+c>b && b+c>a)
			s=a+b+c;
		else
			System.out.println("不合法");
		
		if(s!=0)
			System.out.println("三角形的长度为"+s);
		input.close();

	}

}
