package q2;

public class Main {
public static void main(String[] args) {
	Main m=new Main();
	Loan l=m.getLoan();
	Employee e1=new PermanentEmployee(1212,"Aditya",12000.00);
	Employee e2=new TemporaryEmployee(1812,"Asjdjssd",12,100);
	Employee e3=null;
	System.out.println("Loan amount for Permanent Employee: "+calculateLoanAmount(e1));
	e2.calculateSalary();
	e3.calculateSalary();
}
}
