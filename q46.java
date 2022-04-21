
package doselect_46;

public class Register {
	public String checkCredentials(String email, String pass, String cpass) throws Exception{
		if((!email.contains("@"))||(!email.contains(".")))
			throw new InvalidEmailException("Invalid Email");
		else if(pass.length()<6)
			throw new InvalidPasswordException("Invalid Password");
		else if(cpass!=pass)
			throw new PasswordNotMatchException("Password not match");
		else
			return "Registered";
		
	}
	
}
package doselect_46;

public class InvalidEmailException extends Exception {
	public InvalidEmailException(String msg) {
		super(msg);
		
	}

}
package doselect_46;

public class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String msg) {
		super(msg);
		
	}

}
package doselect_46;

public class PasswordNotMatchException extends Exception{
	public PasswordNotMatchException(String msg) {
		super(msg);
		
	}

}

package doselect_46;

public class main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Register user = new Register();
		try {
		String out = user.checkCredentials("tushar@gmailcom","hiiiiii","hiiiiii");
		System.out.println(out);
		}
		catch(Exception e1) {
		System.out.println(e1);
		}

	}
}

