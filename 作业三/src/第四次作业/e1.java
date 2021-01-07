package 第四次作业;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;
public class e1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int number=input.nextInt();
        while (number!=0) {
            if (number<=100 && number>=0) {
                if (hashMap.containsKey(number)) {
                    hashMap.put(number,hashMap.get(number) + 1);
                }
                else
                    hashMap.put(number,1);
            }
            number=input.nextInt();
        }
        for (Entry<Integer,Integer>entry:hashMap.entrySet()) {
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+((entry.getValue()==1) ? " time ":" times "));
        }
	}

}
