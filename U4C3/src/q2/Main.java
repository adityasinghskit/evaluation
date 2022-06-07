package q2;

public class Main {
	
public static void main(String[] args) {
	Loan l=Loan.getLoan();
	Employee e1=new PermanentEmployee(1212,"Aditya",12000.00);
	Employee e2=new TemporaryEmployee(1812,"Asjdjssd",12,100);
	Employee e3=null;
	System.out.println("Loan amount for Permanent Employee: "+l.calculateLoanAmount(e1));
	System.out.println("Loan amount for Temporary Employee: "+l.calculateLoanAmount(e2));
	System.out.println("Loan amount for Null Employee: "+l.calculateLoanAmount(e3));
}
}
