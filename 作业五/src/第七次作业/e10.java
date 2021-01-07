package 第七次作业;
public class e10 {
	public static void main(String[] args) {
		QuadraticEquation n=new QuadraticEquation(1,4,4);
        if(n.getRoot1()==0 && n.getRoot2()==0){
            System.out.println("The equation has no roots");
        }
        else if(n.getRoot1()==n.getRoot2())
            System.out.println("R : " +n.getRoot1());
        else
            System.out.println("R1 : " +n.getRoot1() + "    " + "R2 :" +n.getRoot2());
	}
}
class QuadraticEquation{
    private double a,b,c;
    QuadraticEquation(double x,double y,double z){
        a=x;
        b=y;
        c=z;
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
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        double s=this.getDiscriminant();
        if(s>=0){
            return (-b+Math.sqrt(s))/(2*a);
        }
        else
            return 0;
    }
    public double getRoot2(){
        double s=this.getDiscriminant();
        if(s>=0){
            return (-b+Math.sqrt(s))/(2*a);
        }
        else
            return 0;
    }
}