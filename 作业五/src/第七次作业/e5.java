package 第七次作业;
import java.util.Calendar;  
import java.util.Date;  
import java.util.GregorianCalendar; 
public class e5 {
	public static void main(String[] args) {
		Calendar n=new GregorianCalendar();
        n.set(Calendar.YEAR,1970);  
        n.set(Calendar.MONTH,1);
        n.set(Calendar.DAY_OF_MONTH,1);
        
        Date d=n.getTime();
        System.out.println(d); 
          
        System.out.println(n.get(Calendar.YEAR));
      
        n.add(Calendar.YEAR, 10);
        System.out.println(n.getTime());
	}

}
