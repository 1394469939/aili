package ��������ҵ;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		int guess, guessDigit1, guessDigit2, guessDigit3;
		final int lotteryDigit1, lotteryDigit2, lotteryDigit3;
		final int lottery = (int)(Math.random() * 1000);
		
		System.out.print("�������Ʊ��: ");
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		
		guessDigit1 = guess/100;
		guessDigit2 = guess%100/10;
		guessDigit3 = guess%10;
		
		lotteryDigit1 = lottery/100;
		lotteryDigit2 = lottery%100/10;
		lotteryDigit3 = lottery%10;
		
		if(lottery == guess)
			System.out.println("��ôţ��:����10000��Ԫ");		
		else if((lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1))
		{
			System.out.println("���԰���С����:����$3000��Ԫ");
		}
		else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3
			||lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3
			||lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)
		{
			System.out.println("�պ�:1000��Ԫ");
		}
		else
			System.out.println("����һ�����ԣ��´�һ���н�^_^");
		input.close();
	}
}
