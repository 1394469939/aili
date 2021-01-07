package 第七次作业;
public class e6 {
	public static void main(String[] args) {
		StopWatch time = new StopWatch();
        int[] n=new int[1000];
        for(int i=1;i<=1000;++i)
            n[i-1]=(int)((System.currentTimeMillis()/i)%10);
        time.start();
        for(int i=0;i<1000;++i){
            for(int j=i+1;j<1000;++j){
                if(n[i]>n[j]){
                    int temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        time.stop();
        System.out.println(time.getElapsedTime());
	}
}
class StopWatch{
    private long startTime;
    private long endTime;
    public void setStartTime(long newStartTime){
        startTime=newStartTime;
    }
    public void setEndTime(long newEndTime){
        endTime=newEndTime;
    }
    public StopWatch(){
        startTime=System.currentTimeMillis();
    }
    public void start() {
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}