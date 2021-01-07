package 第四次作业;

import java.util.Scanner;
public class e4 {
	public static void bubbleSort(double[] list){
		boolean beChanged=false;
		for(int i=0;i<list.length-1;i++){
			beChanged=false;
			for(int j=list.length-1;j>i;j--){
				if(list[j-1]>list[j]){
					double temp=list[j-1];
					list[j-1]=list[j];
					list[j]=temp;
					beChanged=true;
				}
			}
			if(beChanged == false)
				break;
		}
	}
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		double[] list=new double[10];
		System.out.print("Enter ten numbers: ");
		for(int i=0;i<10;i++){
			list[i]=input.nextDouble();
		}
		bubbleSort(list);
		System.out.print("After bubble sort: ");
		for(int i=0;i<10;i++){
			System.out.print(list[i]+" ");
		}
	}

}
