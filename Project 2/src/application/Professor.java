package application;

//Subclass for Professor
class Professor extends EmployeeSystem {
	public String summerCourse;
	public double summerPayment;
	public double grantAmount;
	public double bonus;
	
	//Constructor for Professor, sets basic salary for a professor
	public Professor(String lastName, String firstName, String empAddress, String empId, double grantAmount, String summerCourse, double bonus) {
	super(lastName, firstName, empAddress, empId, 8000);
	 
	this.monthSalary = 8000; // basic salary for a professor
	this.summerCourse = summerCourse;
	this.grantAmount = grantAmount;
	this.bonus = bonus;
	
	 calculateNineMonthSalary();
	 calculateSummerPayment();
	 calculateBonus();
	}
	
	//Overrides the base class method to add specific information for Professor
	@Override
	public String printInfo() {
		super.printInfo();
		
		calculateNineMonthSalary();
		calculateSummerPayment();
	
		return "Summer Course: " + summerCourse
				+ "\nAdditional Payment for Summer Course: $" + summerPayment
				+ "\nGrant Amount: $" + grantAmount + "\nBonus: $" + bonus;
	}
	
	//Calculates bonus based on the grant amount
	public void calculateBonus() {
	 	if (grantAmount > 1000000) {
	 		this.bonus = 7000;
	 		this.annPayment += bonus;
	 	} else {
	 		this.bonus = 0;
	 		this.annPayment += bonus;
	 	}
	}
}