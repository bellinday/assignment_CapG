package assignments;
class Product1{
	String name;
	double price;
	String coupon;
	public Product1(String name, double price, String coupon) {
		this.name=name;
		this.price=price;
		this.coupon=coupon;
	}
}
class Validator{
	public String validateCoupon(Product1 p) throws Exception{
		
		if(p.coupon.indexOf('-')==-1)
			throw new InvalidCouponException("Invalid Coupon");
		if(p.coupon.indexOf('-')!=-1)
		{
			String[] s =p.coupon.split("-");
			
			if(!(s[0].equals(p.name)&&Integer.parseInt(s[1])>=10&&Integer.parseInt(s[1])<=25))
				throw new InvalidCouponException("Invalid Coupon");
			
		}
			return("Valid Coupon");
	}
	public double netPrice(Product1 p) {
		double netprice;
		String[] s =p.coupon.split("-");
		double discount=Integer.parseInt(s[1]);
		netprice =p.price-(discount/100*p.price);
		return netprice;
	}
}
class InvalidCouponException extends Exception{
	public InvalidCouponException(String msg) {
		super(msg);
		
	}
}
public class question8 {
	public static void main(String[] args) {
	Product1 obj = new Product1("IPhone",25000,"IPhone-10");
	Validator val =new Validator();
	try {
	String valCop = val.validateCoupon(obj);
	System.out.println("valCop = "+valCop);
	}
	catch(Exception e) {
	}
	double price = val.netPrice(obj);
	System.out.println("price = "+price);

	
	}
}

