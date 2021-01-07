package 第七次作业;
import java.util.Date;
public class e3 {

	public static void main(String[] args) {
		long L=10000;
		Date date=new Date(L);
		printDate(L,date);
		L*=10;
		for(int i = 0; i < 7; i++) {
			date.setTime(L);
			printDate(L, date);
			L*=10;
		}
	}
	public static void printDate(long L,Date date) {
		System.out.println(L+":"+date.toString());
	}
}
