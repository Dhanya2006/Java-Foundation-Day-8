package Day8;

public class Encapsulation {
	static class Employee{
		private double salary;
		public void setSalary(double salary) {
			if (salary>=0) {
				this.salary=salary;
			}else {
				System.out.println("Salary cannot be negative.");
			}
		}
		public double getSalary() {
			return salary;
		}
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(30000);
		System.out.println("employee salary:" + employee.getSalary());

	}

}
