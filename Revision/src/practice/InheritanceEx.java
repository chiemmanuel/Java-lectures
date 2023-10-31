package practice;

public class InheritanceEx {

	abstract class Company {
		public int companyID;
		public String companyName;
		public float wagesPerHour;
		public int no_of_weeks;
	
		public abstract void calculateSalary();
	}
	
	class Employee extends Company {
		public int employeeID = 1;
		public String employeeName = "test";
		public int total_duration = 0;
		public float salary = 0;
	
		public void calculateSalary() {
			salary = wagesPerHour * total_duration * no_of_weeks;
		}
	
		public void info() {
			System.out.println("Employee ID: " + employeeID);
			System.out.println("Employee Name: " + employeeName);
			System.out.println("Employee Salary: " + salary);
		}
	}
	
	public static void main(String args[]){
		InheritanceEx obj = new InheritanceEx();
		Employee emp = obj.new Employee();
		emp.wagesPerHour = 10;
		emp.no_of_weeks = 4;
		emp.total_duration = 10;
		emp.calculateSalary();
		emp.info();
	}

}
