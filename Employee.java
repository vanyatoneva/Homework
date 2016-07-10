package People;

public class Employee extends Person {
	double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		if(daySalary > 0){
			this.daySalary = daySalary;
		}
	}
	
	double calculateOvertime(double hours){
		return hours * daySalary *1.5;
	}
	
	void showPersonInfo(){
		super.showPersonInfo();
		System.out.println("Day salary: " + daySalary);
	}
}
