
public class Employees {
    // Fields
    private int eid;           // Employee ID
    private String ename;       // Employee Name
    private static String companyName;  // Company Name (static)

    // Parameterized constructor
    public Employees(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    // Static method to set company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Setting the company name using the static method
        Employees.setCompanyName("Tech Solutions Inc.");

        // Creating Employee objects
        Employees emp1 = new Employees(101, "Alice");
        Employees emp2 = new Employees(102, "Bob");

        // Displaying details of each employee
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
