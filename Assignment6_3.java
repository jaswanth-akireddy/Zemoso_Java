//Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

import java.util.Arrays;

class MyClass {
    public MyClass(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MyClass[] arr = new MyClass[3];
        arr[0]= new MyClass("Hello");
        arr[1]= new MyClass("Hello");
        arr[2]= new MyClass("Hello");


        System.out.println(Arrays.toString(arr));
    }
}
