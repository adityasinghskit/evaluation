package q2;

public class PermanentEmployee extends Employee {
	private double basicPay;
	public PermanentEmployee() {
		
	}
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		this.salary=this.basicPay-(this.basicPay*0.12);
		
	}

}
