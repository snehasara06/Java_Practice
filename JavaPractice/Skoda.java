package JavaPractice;

public class Skoda extends Car {
    String color = "Grey";

    String carColor() {
        System.out.println("Child class Color: " + color);
        return super.color;
    }

    void drive() {  
        System.out.println("Parent class: "+super.avgSpeed());
        // carColor();
    }

    String avgSpeed() {
        return "120kmph";
    }

    Skoda(){
        super();
        System.out.println("Skoda is called");
    }
    public static void main(String[] args) {

        // Parent class instance variable
        Skoda sk = new Skoda();
        System.out.println("Parent class Color: " + sk.carColor());

        // Parent class method
        sk.drive();        
        System.out.println("Child class : "+sk.avgSpeed());
    }
}
