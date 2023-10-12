package JavaPractice;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    int employeeId = 31551;
    // VARIABLES TYPES & CLASS STRUCTURE
    // Properties or Fields or Attributes
    String name = ""; // instance variable
    int id = 0;

    String dept = "";
    String des = "";
    String loc = "";
    static Date doj = new Date();
    static String company = "KGISL"; // static variable -memory allocation only once when class is loaded in memory

    // Methods or Functions
    static void displayDetails(String name, int id, String dept, String des, String loc, Date Doj, String company) {

        Date today = new Date(); // local variable
        System.out.println(today);

        System.out.println(
                "NAME : " + name + "\n" +
                        "ID : " + id + "\n" +
                        "DEPARTMENT : " + dept + "\n" +
                        "DESIGNATION : " + des + "\n" +
                        "LOCATION : " + loc + "\n" +
                        "DATE OF JOINING : " + doj + "\n" +
                        "COMPANY : " + company

        );

    }

    public Employee(String eName, int eId) {
        this.name = eName;
        this.id = eId;
    }

    // public Employee() {
    // System.out.println("Employee constructor");
    // }

    // CONSTRUCTOR
    public Employee(String empName, int empId, String empDept) {

        // this keyword- current class constructor-------------------------3
        // this();

        // local variable -empName,empId,empDept
        this(empName, empId); // CONSTRUCTOR CHAINING -this() REAL USAGE
        // this.name = empName;
        // this.id = empId;
        this.dept = empDept;
        // this keyword-Current class instance variable----------------------1

        System.out.println("NAME: " + name + "\n" + "ID: " + id + "\n" + "DEPT:" + dept);
    }

    // Static method-(this and super cannot be used)
    static String companyName() {
        return "KGISL GSS";
        // this.empName=name;
    }

    // Static block
    static {
        System.out.println("Static Block invoked before main method");
    }

    // void welcome() {
    void welcome(Employee obj) {
        System.out.println("Welcome !");
    }

    void message() {
        // this keyword-invoke current class method--------------------2
        // this.welcome();
        // this keyword - pass as an arg in method --------------------4
        welcome(this);
        System.out.println("Message is printed");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee details");
        final String nameString = sc.nextLine();

        final int id = sc.nextInt();
        sc.nextLine();
        final String dept = sc.nextLine();
        final String des = sc.nextLine();
        final String loc = sc.nextLine();
        final Date doj = new Date();
        sc.close();

        displayDetails(nameString, id, dept, des, loc, doj, company);
        Employee emp = new Employee(nameString, id, dept);
        emp.message();

        System.out.println(emp.name);
        // Static variable
        Employee.company = "KGiSL";
        System.out.println("Static variable changes: " + Employee.company);
        // Static method -no object is needed
        System.out.println("Static method: " + companyName());

        // Employee(String empName, int empId, String empDept
        // new Employee(nameString,id,dept);
        // displayDetails("KGiSL", 1, "Java", "Trainee", "CBE", 20-01-2023, "KGiSL");
        // System.out.println(Employee("Sneha",31551,"Java"));
        
        // Employee e = new Employee();
        new Employee("Sneha", 31551, "Java");

        // Employee.displayDetails("KGiSL", 1, "Java", "Trainee", "CBE", "2023-01-20", "KGiSL");

        new Employee().getEmp().domain();
    }

    Employee() {
        // this keyword- to pass as argument in the constructor call ------------------5
        Trainee trainee = new Trainee(this);
        trainee.displayId();

    }

    Employee getEmp() {
        // this keyword - return current class instance------------------6
        return this;
    }

    void domain() {
        System.out.println("DOMAIN : JAVA PROGRAMMING");
    }

}

class Trainee {
    Employee emp1;

    Trainee(Employee emp1) {
        this.emp1 = emp1;
    }

    void displayId() {
        System.out.println("EMPLOYEE ID : " + emp1.employeeId);
    }
}