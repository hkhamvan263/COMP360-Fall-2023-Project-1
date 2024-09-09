package application;

//Subclass for Lecturer
class Lecturer extends EmployeeSystem {
	// Constructor for Lecturer, sets basic salary for a lecturer
	public Lecturer(String lastName, String firstName, String empAddress, String empId) {
	   super(lastName, firstName, empAddress, empId, 3000);
	   
	   this.monthSalary = 3000; // basic salary for a lecturer
	}
	
	
	// Overrides the base class method to add specific information for Lecturer
	@Override
	public String printInfo() {
	   super.printInfo();
	
	   calculateNineMonthSalary();
	
	   return "There are no summer courses available for Lecturer to teach."
	   		+ "\nLecturers do not qualify for bonus.";
	}
}