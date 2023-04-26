//Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.

public class Assignment7 {

        public static void main(String[] args) {
            Rodent[] rodents = new Rodent[3];
            rodents[0] = new Mouse();
            rodents[1] = new Gerbil();
            rodents[2] = new Hamster();

            for (Rodent rodent : rodents) {
                rodent.eat();
                rodent.run();
            }
        }
}

abstract class Rodent {
    public Rodent() {
        System.out.println("Creating a Rodent");
    }
    public abstract void eat();
    public void run() {
        System.out.println("Rodent is running");
    }
}

class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Creating a Mouse");
    }
    public void eat() {
        System.out.println("Mouse is eating");
    }
    public void run() {
        System.out.println("Mouse is running");
    }
}

class Gerbil extends Rodent {
    public Gerbil() {
        System.out.println("Creating a Gerbil");
    }
    public void eat() {
        System.out.println("Gerbil is eating");
    }
    public void run() {
        System.out.println("Gerbil is running");
    }
}

class Hamster extends Rodent {
    public Hamster() {
        System.out.println("Creating a Hamster");
    }
    public void eat() {
        System.out.println("Hamster is eating");
    }
    public void run() {
        System.out.println("Hamster is running");
    }
}

