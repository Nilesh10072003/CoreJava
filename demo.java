package assingment;


class Employee
{
	public static int id;
	 public static String name;
	 public static int age;
	 public static int salary;
	 
	 public void display() {
	        System.out.println("ID: " + id + " Name: " + name + " Age: " + age + " Salary: $" + salary);
	    }
}
public class demo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=1;
		e1.name="nilesh";
		e1.age=21;
		e1.salary=12000;
		
		Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Ramesh";
        e2.age = 25;
        e2.salary = 15000;

        Employee e3 = new Employee();
        e3.id = 3;
        e3.name = "Suresh";
        e3.age = 28;
        e3.salary = 18000;

        Employee e4 = new Employee();
        e4.id = 4;
        e4.name = "Mahesh";
        e4.age = 30;
        e4.salary = 22000;

        Employee e5 = new Employee();
        e5.id = 5;
        e5.name = "Rajesh";
        e5.age = 32;
        e5.salary = 25000;
        
        Employee e6 = new Employee();
        e6.id = 6;
        e6.name = "Sanjay";
        e6.age = 26;
        e6.salary = 17000;
        
        Employee e7 = new Employee();
        e7.id = 7;
        e7.name = "Anil";
        e7.age = 29;
        e7.salary = 24000;

        Employee e8 = new Employee();
        e8.id = 8;
        e8.name = "Sunil";
        e8.age = 27;
        e8.salary = 21000;

        Employee e9 = new Employee();
        e9.id = 9;
        e9.name = "Vikas";
        e9.age = 31;
        e9.salary = 23000;
        
        Employee e10 = new Employee();
        e10.id = 10;
        e10.name = "Ajay";
        e10.age = 24;
        e10.salary = 16000;

		System.out.println("Employee 1 Details:");
        e1.display();
        System.out.println("\nEmployee 2 Details:");
        e2.display();
        System.out.println("\nEmployee 3 Details:");
        e3.display();
        System.out.println("\nEmployee 4 Details:");
        e4.display();
        System.out.println("\nEmployee 5 Details:");
        e5.display();
        System.out.println("\nEmployee 6 Details:");
        e6.display();
        System.out.println("\nEmployee 7 Details:");
        e7.display();
        System.out.println("\nEmployee 8 Details:");
        e8.display();
        System.out.println("\nEmployee 9 Details:");
        e9.display();
        System.out.println("\nEmployee 10 Details:");
        e10.display();
	}

}