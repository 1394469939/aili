package 第四次作业;
import java.util.Scanner;
public class e5 {
	public static void main(String[] args) {
		 System.out.print("Enter the size of the list:");
	     @SuppressWarnings("resource")
	     Scanner input = new Scanner(System.in);
	     int number = input.nextInt();
	     int[] list = new int[number];

	     System.out.print("Enter the contents of the list:");
	     for(int i=0;i<list.length;i++)
	         list[i]=input.nextInt();
	     
	     System.out.print("The list has "+number+" integers ");
	     for(int i = 0;i < list.length;i++)
	    	 System.out.print(list[i]+" ");
	     if(!isSorted(list))
	         System.out.println("\nThe list is not sorted");
	     else
	    	 System.out.println("\nThe list is already sorted");
	    }
	    public static boolean isSorted(int[] list){
	        for(int i=1;i<list.length;i++){
	            if(list[i-1]>list[i]){
	                return false;
	            }
	        }
	        return true;
	}
}
