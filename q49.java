package assignments;
class Build{
	int length;
	int width;
	public Build(int length, int width) {
		this.length=length;
		this.width=width;
	}
	public String builder(int blength, int bwidth, int count) throws ShortageException, TendorException {
		int actualCount;
		actualCount=(length/blength)*(width/bwidth);
		if(length%blength!=0)
			actualCount++;
		if(width%bwidth!=0)
			actualCount++;
		if(length%blength==0&&width%bwidth==0&&actualCount>count)
			throw new ShortageException("Need more bricks");
		if(length%blength!=0||width%bwidth!=0&&actualCount<count)
			throw new TendorException("Building dimension mismatched");
		if(length%blength!=0||width%bwidth!=0&&actualCount>count)
			throw new ShortageException("Need more bricks with dimension mismatched");
			return"Builder!!";
		}	
	}
class ShortageException extends Exception{
	public ShortageException(String msg) {
		System.out.println("ShortageException: "+msg);
	}
}
class TendorException extends Exception{
	public TendorException(String msg) {
		System.out.println("TendorException: "+msg);
	}
}
public class question49 {
	public static void main(String[] args) {
		Build build = new Build(100,100);
		try {
		String s = build.builder(10, 10, 100);
		System.out.println(s);
		String s1 = build.builder(10, 10, 50);
		
		System.out.println(s1);
	}
		catch(Exception e) {
			
		}
	}
}

