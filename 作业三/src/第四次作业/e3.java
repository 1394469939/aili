package 第四次作业;

import java.util.Scanner;
public class e3 {
	private String name;
	private long chengji;
	public long getChengji() {
		return chengji;
	}
	public void setChengji(long chengji) {
		this.chengji=chengji;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int sNum=input.nextInt();
		int i,j;
		e3 b[]= new e3[sNum];
		for (i=0;i<b.length;i++) {
			b[i]=new e3();
			String name=input.next();
			b[i].setName(name);
			long chengji=input.nextLong();
			b[i].setChengji(chengji);
			
		}
		for (i=0;i<b.length;i++) {
			for (j=i+1;j<b.length;j++) {
				if(b[i].getChengji()<b[j].getChengji()) {
					e3 s=new e3();
					s=b[i];
					b[i]=b[j];
					b[j]=s;
				}
			}
		}
		for (i=0;i++<b.length;i++) {
			System.out.println(b[i].getName() + "的成绩:" + b[i].getChengji());
		}
	}

}
