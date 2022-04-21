package Assign;



class Credentials{
	String userName;
	String password;
	public Credentials(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	
}
class Implementation{
	public String passwordValidator(Credentials details)throws Exception {
	        if (details.password=="^(?=.[0-9])"+ "(?=.[a-z])(?=.[A-Z])"+ "(?=.[@#$%^&+=])") {
	        	throw new  MissingCharacterException ("password must contain at least one special character, at least one upper case alphabet, at least one lower case alphabet, and at least one digit");
	        
		}
	        else if(!((details.password.length() >= 8)
	                && (details.password.length() <= 40) )){
	        	throw new LengthMismatchException("length of the password is not between 8 to 40");
	        }
	        else
	        	return "valid Password";
	}      	
public String signUp(Credentials details){
	try{
		passwordValidator(details);
	}
	catch(MissingCharacterException e1) {
		return "invalid details";
	}
	catch(LengthMismatchException e2){
		return "invalid details";
	}
	catch(Exception e3){
		return "Other exception";
	}
	return "signup successfully";
	}

}

class MissingCharacterException extends Exception{
	public MissingCharacterException(String msg){
		super(msg);
	}
}

class LengthMismatchException extends Exception{
	public LengthMismatchException(String msg){
		super(msg);
	}
}


public class assign6 {
	public static void main(String args[]) throws Exception{

	Implementation obj = new Implementation();
	String pass=obj.passwordValidator(new Credentials("Steve", "Akjsdhhj@1"));
	String sign=obj.signUp(new Credentials("Bob", "jsdhJS12*&$1"));
	 System.out.println(pass);
	   System.out.println(sign);
	}
}
