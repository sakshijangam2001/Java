class User {
	int id;
	String name;

public User(int id, String name) {
	this.id=id;
	this.name=name;
}
}
       class Employee extends User {
	    double salary;

	    public Employee(int id, String name, double salary) {
	        super(id, name);
	        this.salary = salary;
	    }

	    public double calculateAnnualSalary() {
	        return salary * 12; 
	    }
	}


public class InheritanceExample {

	 public static void main(String[] args)
	    {
	        Employee employee = new  Employee (1, "Sakshi Jangam", 16000);

	       
	        double annualSalary = employee.calculateAnnualSalary();
	        System.out.println("Employee " + employee.name + "'s annual salary: $" + annualSalary);
	    }
	}
	

