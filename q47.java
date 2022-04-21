package doselect47;

public class Customer {
	String name;
	int numberOfRooms;
	public Customer(String name, int numberOfRooms) {
		
	}
	

}
package doselect47;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	List<String> customerName = new ArrayList<>();
	int roomsBooked=0;
	int flag=0;
	
	public String checkIn(Customer customer) {
		if(roomsBooked<=10) 
		{
			flag=1;
			roomsBooked+=1;
			customerName.add(customer.name);
			return " Checked in";
			
		}
		else
			return "No rooms available";
		
		
	}
	
	public String checkRooms(Customer customer) {
		if(flag==1)
			return "Yes";
		else
			return "No";
		
	}
	

}

package doselect47;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust=new Customer("Doselect", 4);
		Hotel hotel=new Hotel();
		String out =hotel.checkIn(cust);
		System.out.println(out);


	}

}
