package Assign;
import java.lang.*;

class Person{
   String name;
  String dateOfBirth;
   String email;

	public Person(String name,String dateOfBirth,String email){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
	}
}
class Implementation1{
    
	String  validator(Person   details ) throws Exception{
		String[] s =details.dateOfBirth.split("-");
		String domainName=details.email.substring(details.email.indexOf('@'));
		if(Integer.parseInt(s[0])>2000||Integer.parseInt(s[2])>2000 ){
			throw new  InvalidDateException ("date year must be less than 2000");
		}
		
		else if(details.email=="@doselect.com"){
			throw new InvalidEmailException("only @doselect.com domain email are accepted");
		}
		else{
			return " valid details ";
	}
	}		
	String  submitDetails(Person   details ) throws Exception{
		try{
			validator(details);
		}
		catch(InvalidDateException e1){
			return "invalid details";
		}
		catch(InvalidEmailException e2){
			return "invalid details";
		}
		catch(Exception e3){
			return "Other exception";
		}
		return "details submitted successfully";
	}
}	
	
class  InvalidDateException extends Exception{
	public InvalidDateException(String msg){
		super(msg);
	}
}
class InvalidEmailException  extends Exception{
	public InvalidEmailException(String msg){
		super(msg);
	}
}
public class assign7 {
	public static void main(String args[]) throws Exception{
	Person data = new Person("Steve", "12-02-1998", "Steve12@doselect.com");
	Implementation1 obj = new Implementation1();
	//obj.validator(data);
	//obj.submitDetails(data);
	String ans = obj.validator(data);
	String per =  obj.submitDetails(data);
   System.out.println(ans);
   System.out.println(per);
	}
}
