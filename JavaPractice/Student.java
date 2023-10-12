package JavaPractice;

import java.util.Scanner;

// import JavaPractice.Course;

public class Student {
    public static void main(String[] args) {

        Individual one = new Individual();

        Scanner sc = new Scanner(System.in);

        String stuName = sc.next();
        int stuAge = sc.nextInt();

        System.out.println(one.display(stuName, stuAge));

    // Private access modifier
        // one.email="sneha.sara.06@gmail.com";
        // System.out.println(one.email);
        sc.close();

    // Public access modifier-within package-Course.java
        Courses c = new Courses();
        System.out.println(c.nameDisplay(stuName));

    // Protected access modifier-within package-Course.java
        c.welcome("Sneha");
    }
}

class Individual {
// Public access modifier within class
    public String name;
    public int age;
    // private String email = "";

    public String display(String name, int age) {
        return name + age;
    }
}