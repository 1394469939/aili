package 第四次作业;

import java.util.Scanner;
public class e2 {
	public static void main(String[] args) {
		int i,j,s=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		System.out.print("Enter the numbers: ");
		for (i=0;i<a.length;i++)
			a[i]=input.nextInt();
		for (i=0;i<a.length;i++)
			for (j=i+1;j<b.length;j++)
				if(a[i]==a[j])
					a[j]=0;
		for (i=0,j=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				b[j]=a[i];
				j++;
				s++;
			}
		}
		System.out.println("The number of distinct number is" + s);
		for (i=0;i<j;i++)
			System.out.println("The distinct numbers are:" +b[i]);
	}

}
