package 作业九;

import java.util .Scanner;
public class e6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		if(!isHexNumber(hex))
			throw new NumberFormatException("输入为非16进制数");
		System.out.println("The decimal value for hex number"+ hex + " is " + hexToDecimal (hex.toUpperCase()));
	}
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for(int i=0;i<hex.length();i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch -'A';
		else
			return ch- '0';
	}
	public static boolean isHexNumber(String str){
		boolean flag = false;
		int s = 0;
		for(int i=0;i<str.length();i++){
			char cc = str.charAt(i);
			if(cc=='0'||cc=='1'||cc=='2'||cc=='3'||cc=='4'||cc=='5'||cc=='6'||cc=='7'||cc=='8'||cc=='9'||cc=='A'||cc=='B'||cc=='C'||
					cc=='D'||cc=='E'||cc=='F'||cc=='a'||cc=='b'||cc=='c'||cc=='c'||cc=='d'||cc=='e'||cc=='f'){
				s+=1;
			}
			if(s == str.length())
					flag=true;
		}
		return flag;
	}

}
