package 第三次作业;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		int guess, guessDigit1, guessDigit2, guessDigit3;
		final int lotteryDigit1, lotteryDigit2, lotteryDigit3;
		final int lottery = (int)(Math.random() * 1000);
		
		System.out.print("输入你的票号: ");
		Scanner input = new Scanner(System.in);
		guess = input.nextInt();
		
		guessDigit1 = guess/100;
		guessDigit2 = guess%100/10;
		guessDigit3 = guess%10;
		
		lotteryDigit1 = lottery/100;
		lotteryDigit2 = lottery%100/10;
		lotteryDigit3 = lottery%10;
		
		if(lottery == guess)
			System.out.println("这么牛吗:奖金10000美元");		
		else if((lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3)
			||(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)
			||(lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1))
		{
			System.out.println("可以啊！小伙子:奖金$3000美元");
		}
		else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3
			||lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3
			||lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)
		{
			System.out.println("刚好:1000美元");
		}
		else
			System.out.println("再买一个试试，下次一定中将^_^");
		input.close();
	}
}
