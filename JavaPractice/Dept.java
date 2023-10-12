package JavaPractice;

import java.util.Scanner;

public class Dept extends Courses {
    public static void main(String[] args) {
        Courses c1 = new Courses();
        // Dept c1=new Dept();

        System.out.println("Enter your  name -");
        Scanner sc = new Scanner(System.in);
        String empName = sc.next();

    //Accessing Public method outside class
        System.out.println("EMPLOYEE NAME : " + c1.nameDisplay(empName));
    // Accessing Protected method outside class
        c1.welcome(empName);

        sc.close();
    }
}
