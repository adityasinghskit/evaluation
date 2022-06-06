package q2;

public class Loan {
	 Loan() {
	}
	public Loan getLoan() {
		return new Loan();
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			employeeObj.calculateSalary();
			double d= employeeObj.salary*0.15;
			return d;
		}else if(employeeObj instanceof TemporaryEmployee) {
			employeeObj.calculateSalary();
			double d= employeeObj.salary*0.10;
			return d;
		}else {
			return 0;
		}
	}
}
