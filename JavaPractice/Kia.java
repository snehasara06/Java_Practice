package JavaPractice;

public class Kia extends Car {
    public static void main(String[] args) {
//Final method can be inherited
        Car c = new Car();
        c.modelName();
    }
// FINAL method cannot be overridden
    // String modelName(){
    // return "seltos";
    // }
}
