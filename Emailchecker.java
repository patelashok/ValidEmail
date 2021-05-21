package email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Emailchecker {
	 private boolean check;
	 private String email;
	 private static  Scanner SCANNER  = new Scanner(System.in);
	 public void checkemail() {
	        System.out.println("Enter email : ");
	        email = SCANNER.nextLine();
	        check = Pattern.compile("^[a-z]*$").matcher(email).matches();
	        if (!check) {
	            System.out.println("Invalid!!Please Enter your eamil.");
	            checkemail();
	        }
	        else {
	            System.out.println(" It's a Valid Email ");
	        }
	    }
	

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Emailchecker em = new Emailchecker();
		em.checkemail();
		
		
	}

}
