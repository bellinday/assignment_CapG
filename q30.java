package assignments;
class Stocks{
	public float stockRate;
	public Stocks(float stockRate) {
		this.stockRate=stockRate;
	}
	public String checkRate(float Rate) throws Exception{
		if(Rate==0.8*stockRate)
			return"Hope to Rise";
		else if(Rate<0.8*stockRate)
			throw new StockLowException("Under Loss");
		else
			throw new StockHighException("Under Profit");
	}
}
class StockHighException extends Exception{
	public StockHighException(String msg){
		System.out.println("StockHighException : "+msg);
	}
}
class StockLowException extends Exception{
	public StockLowException(String msg) {
		System.out.println("StockLowException : "+msg);
	}
}
public class question30 {
	public static void main(String[] args) {
	Stocks stock = new Stocks(10.0f);
	try {
	String s = stock.checkRate(5.0f);
	System.out.println(s);
	}
	catch(Exception e) {
		
	}
}
}

