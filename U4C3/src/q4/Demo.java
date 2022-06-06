package q4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
public static void main(String[] args) {
	
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter Cutomer details: ");
	System.out.println("Username: ");
	String username=s1.next();
	System.out.println("Password: ");
	String password=s1.next();
	System.out.println("Mobile");
	String mobile=s1.next();
	System.out.println("Email");
	String email=s1.next();
	boolean b1=Pattern.matches("[a-zA-Z]{3,8}", username );
	boolean b2=Pattern.matches("\\w{3,8}",password);
	boolean b3=Pattern.matches("[6789][0-9]{9}",mobile);
	boolean b4=Pattern.matches("\\w+[@]\\w+[.][a-z]+",email);
	if(b1== true && b2== true && b3==true && b4== true) {
	Customer c1= new Customer(username, password, mobile, email);
	c1.toString();
	}else {
		System.out.println("Enter deatils in valid format.");
	}
}
}
