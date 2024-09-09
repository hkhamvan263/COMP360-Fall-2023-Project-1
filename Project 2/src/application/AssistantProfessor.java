package application;

//Subclass for Assistant Professor
class AssistantProfessor extends EmployeeSystem {
	public String summerCourse;
	public double summerPayment;
	
	//Constructor for AssistantProfessor, sets basic salary for an assistant professor
	public AssistantProfessor(String lastName, String firstName, String empAddress, String empId, String summerCourse) {
		super(lastName, firstName, empAddress, empId, 6000);
		
		this.monthSalary = 6000; // basic salary for an assistant professor
		this.summerCourse = summerCourse;
		
		calculateNineMonthSalary();
		calculateSummerPayment();
	}
	
	//Overrides the base class method to add specific information for Assistant Professor
	@Override
	public String printInfo() {
		super.printInfo();
		
		calculateNineMonthSalary();
		calculateSummerPayment();
		
		return "Summer Course: " + summerCourse
				+ "\nAdditional Payment for Summer Course: $" + summerPayment
				+"\nAssistant Professors do not qualify for bonus.";
	}
}