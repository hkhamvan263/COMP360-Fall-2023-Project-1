package application;

//Base class with variables for all employees
public class EmployeeSystem {
	public String firstName;
	public String lastName;
	public String empAddress;
	public String empID;
	public double monthSalary;
	public double annPayment;
	public double summerPayment;
	
	// Constructor to initialize variables
	public EmployeeSystem(String lastName, String firstName, String empAddress, String empId, double monthSalary) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.empAddress = empAddress;
		this.empID = empId;
		this.monthSalary = monthSalary;
		this.annPayment = 0; // Initialize to 0
	}
	
	// Calculates annual payment (span of nine months)
	public void calculateNineMonthSalary() {
		this.annPayment = 9 * this.monthSalary;
	}
	
	// Calculates summer payment based on the basic salary
	public void calculateSummerPayment() {
		this.summerPayment = 1.5 * this.monthSalary;
	}
	
	// Displays general information about the employee
	public String printInfo() {
		return "Employee Information:\n" + "Name: " + firstName + " " + lastName + "\nID: " + empID
				+ "\nAddress: " + empAddress + "\nMonthly Salary: $" + monthSalary
				+ "\nNine Month Salary: $" + annPayment;
	}
}