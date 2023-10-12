package JavaPractice;

// Final class-cannot be extended
    // final public class Car {

public class Car{
String color="Black";

// Blank final variable-initialized in constructor
    final String type;
    Car(){
        System.out.println("Car is called");
        type="Sedan";
        System.out.println("KIA CAR TYPE: "+type);
    }
    String avgSpeed(){
        return "100 kmph";
    }

//Final Variable cannot be reassigned
    final int price = 10_00_000;
    // void print() {
    //     price = 5_00_000;
    // }

// Final method -Kia.java
    final String modelName(){
        return "KIA-SELTOS";
    }
// Final parameter-cannot change value
    String carName(final String name){
        // name="Kia";
        return name;
    }

    public static void main(String args[]) {
        // System.out.println("Hai Sneha !");
        // new Car();

        
        //   int b=10110001;
        //   // Converts number to String
        //   // String convertedByte=String.valueOf(b);
        //   String convertedByte=b+"";
        //   System.out.println(convertedByte);
        //   // check the datatype of the variable
        //   Class <? extends String>cls=convertedByte.getClass();
        //   System.out.println(cls.getName());
        //   float a =4.5f,b1=4.7f;
        // System.out.println(a/b1);
         
        // int []A={1,2,3,4,5};
        // A[3]=15;
        // for (int i=0;i<A.length;i++){
        // System.out.println(A[i]++);
        // }
        // for(int x:A){
        // System.out.println(x);
        // }
        // public class ArrayElementRemoval {
        // public static void main(String[] args) {
        // int[] array = { 10, 20, 30, 40, 50 };
        // int elementToDelete = 30;

        // // Find the index of the element to delete
        // int indexToDelete = -1;
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] == elementToDelete) {
        // indexToDelete = i;
        // break;
        // }
        // }

        // // If the element is found, remove it
        // if (indexToDelete != -1) {
        // // Shift elements to the left
        // for (int i = indexToDelete; i < array.length - 1; i++) {
        // array[i] = array[i + 1];
        // }

        // // Reduce the size of the array
        // int[] newArray = new int[array.length - 1];
        // System.arraycopy(array, 0, newArray, 0, newArray.length);
        // array = newArray;
        // }

        // // Print the updated array
        // for (int num : array) {
        // System.out.print(num + " ");
        // }
        // }
        // }
        // int B[]={8,6,10,9,2,15,7,13,14,11};
        // int C[]=new int[10];

        // for(int i=0;i<B.length;i++)
        // {
        // C[i]=B[i];
        // }
        // System.out.println("C array");
        // for(int x:C)
        // {
        // System.out.print(x+",");
        // }
        // System.out.println("");
        // System.out.println("B array");

        // for(int x:B)
        // {
        // System.out.print(x+",");
        // }
        // {
        //     int A1[] = { 8, 6, 10, 9, 2 };

        //     System.out.println("Length of A=" + A1.length);

        //     int B1[] = new int[10];

        //     for (int i = 0; i < A1.length; i++) {
        //         B1[i] = A1[i];
        //     }
        //     A1 = B1;

        //     System.out.println("Length of A=" + A1.length);

        // }
    }
}
