package 第七次作业;
public class e11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearEquation linearEquation1=new LinearEquation(9,4,3,-5,-6,-21);
		if(linearEquation1.isSolvable()) {
			System.out.println("X is: "+linearEquation1.getX()+"  and\tY is : "+linearEquation1.getY());
		}
		else
			System.out.print("The equation has no solution");
		LinearEquation linearEquation2=new LinearEquation(1,2,2,4,4,5);
		if(linearEquation2.isSolvable()) {
			System.out.println("X is: "+linearEquation2.getX()+"  and\tY is : "+linearEquation2.getY());
		}
		else
			System.out.print("The equation has no solution");
	}
}
class LinearEquation{
	private double a,b,c,d,e,f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA(){
        return a;
	}
	public double getB(){
        return b;
	}
	public double getC(){
        return c;
	}
	public double getD(){
        return d;
	}
	
	public double getE(){
        return e;
	}
	public double getF(){
        return f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0) {
			return true;
		}
		else
			return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}