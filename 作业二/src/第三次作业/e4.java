package ��������ҵ;
import java.util.Scanner;
public class e4 {

	public static void main(String[] args) {
double a,b,c,s=0;
		
		// Prompt the user to enter three edges
		System.out.print("���������ε�������: ");
		Scanner input = new Scanner(System.in);
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		if(a+b>c && a+c>b && b+c>a)
			s=a+b+c;
		else
			System.out.println("���Ϸ�");
		
		if(s!=0)
			System.out.println("�����εĳ���Ϊ"+s);
		input.close();

	}

}
