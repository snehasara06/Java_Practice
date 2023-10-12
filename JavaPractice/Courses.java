package JavaPractice;

import java.util.Scanner;

public class Courses {
    // Public access modifier outside the class-Dept.java
    public String nameDisplay(String name) {
        return name;
    }

    // Protected access modifier - Dept.java
    protected void welcome(String name) {
        System.out.println("WELCOME " + name + " !!!");
    }

    // Private access modifier- with Getter and Setter
    private String emailId = "";

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }
    // Default access modifier
    void company(){
        System.out.println("COMPANY NAME: KGiSL");
     }
    
    public static void main(String[] args) {
        System.out.println("In main method");

        System.out.println("Enter your name- ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Enter your email id- ");

        String email = sc.nextLine();

        Courses c = new Courses();
        System.out.println("-------------");
        System.out.println("NAME :" + c.nameDisplay(name));

        c.setEmailId(email);
        System.out.println("EMAIL ID: " + c.getEmailId());
        c.company();
        c.welcome(name);

        sc.close();
    }
}
