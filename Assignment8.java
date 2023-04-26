//Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

import java.io.IOException;

class Exception1 extends Exception {
    Exception1(String message) {
        super(message);
    }
}

class Exception2 extends Exception {
    public Exception2(String message) {
        super(message);
    }
}

class Exception3 extends Exception {
    public Exception3(String message) {
        super(message);
    }
}

class Thrower {
    public void throwExceptions(int exceptionNumber) throws Exception1, Exception2, Exception3 {
        // throw exceptions based on input
        if (exceptionNumber == 1) {
            throw new Exception1("Exception 1");
        } else if (exceptionNumber == 2) {
            throw new Exception2("Exception 2");
        } else {
            throw new Exception3("Exception 3");
        }
    }
}

class Exception_Main {
    public static void main(String[] args) {
        Thrower thrower = new Thrower();
        try {
            thrower.throwExceptions(9); // pass in a number to choose which exception to throw
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
