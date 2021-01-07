package 第四次作业;

public class e6 {

	public static void main(String[] args) {
		boolean[] L=new boolean[100];
		int i,j;
        for(i=0;i<L.length;i++)
            L[i]=false;
        for(i=0;i<L.length;i++)
            L[i]=true;
        for(i=1;i<L.length;i+=2)
            L[i]=false;
        for(i=2;i<100;i++){
            for(j=i;j<L.length;j+=(i+1)){
                if(L[i]==false)
                    L[i]=true;
                else L[i]=false;
            }
        }
        for(i=0;i<L.length;i++){
            int count=1;
            if(L[i]==true) {
                System.out.print(i+1+" ");
                count++;
            }
            if(count%5==0){
                System.out.println();
            }
        }
	}

}
