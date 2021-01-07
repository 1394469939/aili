package 第十次作业;
import java.util.Scanner;
public class ChongFu {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] n= new int[10];
		int i;
		for(i=0;i<10;i++)
			n[i]= input.nextInt();
		System.out.print("The distinct numbers are ");
		int[] m={1,1,1,1,1,1,1,1,1,1};
		for(i=0;i<10;i++)
			for(int j=9;j>i;j--)
				if(n[i]==n[j])
					m[j] = -1;
		for(i=0;i<10;i++)
			if(m[i]==1)
				System.out.print(n[i] +" ");
	}
}
