package 第七次作业;
import java.util.Random;
public class e4 {
	public static void main(String[] args) {
		Random random = new Random(1000);
		int n=0;
        for(int i=0;i<50;i++,n++) {
            if(n% 10 == 0)
                System.out.println("");
            System.out.print(random.nextInt(100) + " ");
		}
	}
}
