package doselect48;
import java.lang.Math;

public class RacingCar {
	int speed;
	int distance;
	int petrolRate;
	public RacingCar(int speed, int distance, int petrolRate) {
		this.speed=speed;
		this.distance=distance;
		this.petrolRate=petrolRate;
	}
	
public int validateCar(int time) throws LowSpeedException,HighSpeedException{	
		
		if((Math.ceil(distance/time)) > time) {
			
			throw new LowSpeedException("Upgrade Car");

		}
		else if ((Math.ceil(distance/time)) < time) {
			
			throw new HighSpeedException("Accident Chances");
		}
		else
			
		    return calculateprice();
	}
	public int calculateprice() {
		
		return (int) Math.ceil(distance/petrolRate);
		
	}

}

package doselect48;

public class HighSpeedException extends Exception{
	public HighSpeedException(String msg) {
		super(msg);
	}

}

package doselect48;

public class LowSpeedException extends Exception{
	public LowSpeedException(String msg) {
		super(msg);
	}

}

package doselect48;

public class main {
	public static void main(String[] args) throws Exception  {
		
		RacingCar car = new RacingCar(100,1000,11);
         try {
			System.out.println( car.validateCar(50));
         }
         catch(Exception e1) {
        	 System.out.println(e1);
         }

	}

}	
