package 作业九;

import java.util.Scanner;
public class e7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a bin number: ");
		String bin = input.nextLine();
		if(!isBinNumber(bin))
			throw new NumberFormatException("输入为非2进制数");
		System.out.println("Output: "+Integer.parseInt(bin,2));;
	}
	public static boolean isBinNumber(String str){
		boolean flag = false;
		int s = 0;
		for(int i=0;i<str.length();i++){
			char cc = str.charAt(i);
			if(cc=='0'||cc=='1'){
				s+=1;
			}
			if(s == str.length())
					flag=true;
		}
		return flag;
	}
}
