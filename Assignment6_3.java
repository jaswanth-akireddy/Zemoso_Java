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
