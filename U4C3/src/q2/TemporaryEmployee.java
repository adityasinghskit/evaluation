package q2;

public class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	public TemporaryEmployee() {
		
	}
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	@Override
	void calculateSalary() {
		this.salary=this.hoursWorked*this.hourlyWages;
		
		
	}
	
}
