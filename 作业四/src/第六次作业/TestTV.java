package ��������ҵ;

public class TestTV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tvl = new TV();
		tvl.turnOn();
		tvl.setChannel(30);
		tvl.setVo1ume(3);
		
		TV tv2 = new TV();
		tv2.turnOn ();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tvl's channel is " + tvl.channel+ " and volume level is " + tvl.volumeLevel);
		System.out.println("tv2's channel is " + tv2.channel+ " and volume level is " + tv2.volumeLevel);
	}

}
