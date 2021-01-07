package ×÷Òµ¾Å;

public class HexFormatException extends Exception{
	String hexString;
	public HexFormatException(String hexString){
		super("HexFormatException: " + hexString);
        this.hexString = hexString;
	}
	public String getHexString(){
        return hexString;
    }
}
