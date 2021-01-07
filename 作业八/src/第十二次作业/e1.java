package 第十二次作业;

import java.util.*;
public class e1 {
	/**
	 * @author 买买提依力·买合木提
	 * @date 00, 2020, 12, 23日  20:16
	 * 使用List和Map存放多个图书信息，
	 * 遍历并输出。其中商品属性：编号，名称，单价，出版社;
	 * 使用商品编号作为Map中的key。
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Books e1= new Books(15623-03, "Java", 85.00, "机械工业出版社");
	     Books e2= new Books(27384-01, "数据结构", 57.00, "清华大学出版社");
	     Books e3= new Books(39662-00, "高等数学", 155.0, "高等教育出版社");
	     Books e4= new Books(53527-02, "概率论与数理统计", 124.0, "高等教育出版社");
	     Books e5= new Books(286181, "大学英语", 56.80, "上海外语出版社");
	     Books e6= new Books(82383-02, "大学物理", 88124.0, "高等教育出版社");
	     Books e7= new Books(89653-02, "计算机组成原理", 113.0, "清华大学出版社");
	     //然后放进HashMap中,Key是图书的编号,value是图书对象
	     HashMap<Integer, Books> booksHashMap = new HashMap<>();
	     booksHashMap.put(e1.getNum(),e1);
	     booksHashMap.put(e2.getNum(),e2);
	     booksHashMap.put(e3.getNum(),e3);
	     booksHashMap.put(e4.getNum(),e4);
	     booksHashMap.put(e5.getNum(),e5);
	     booksHashMap.put(e6.getNum(),e6);
	     booksHashMap.put(e7.getNum(),e7);

	     List<HashMap<Integer, Books>> booksList = new ArrayList<>();
	     booksList.add(booksHashMap);
	     System.out.println("编号\t名称\t单价\t出版社");
	        for (HashMap<Integer, Books> h : booksList) {
	            //获取key
	            Set<Integer> key = h.keySet();
	            for (Integer i : key) {
	                //再通过key找value
	                System.out.println(i+ "\t" + h.get(i).getName()+ "\t" + h.get(i).getPrice()+ "\t" + h.get(i).getPress());
	            }
	        }
	}
}
/**
 * Books(图书类)
 * 用于存放图书的属性
 * num 编号
 * name 名称
 * price 价格
 * press 出版社
 */
class Books {
	private int num;
    private String name;
    private double price;
    private String press;

    public Books() {
    }
    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }
    int getNum() {
        return num;
    }
    String getName() {
        return name;
    }
    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }
}