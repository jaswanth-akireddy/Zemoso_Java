//Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.

public class Assignment7_3 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Try to call balance() on each element of the array
        // This will result in a compile-time error for the Tricycle element
        for (Cycle cycle : cycles) {
            // cycle.balance(); // This will not compile for Tricycle
        }
        for (Cycle cycle : cycles) {
            if (cycle instanceof Unicycle) {
                Unicycle unicycle = (Unicycle) cycle;
                unicycle.balance();
            } else if (cycle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) cycle;
                bicycle.balance();
            }
        }
    }
}


class Cycle {
    public void ride() {
        System.out.println("Riding a cycle");
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Riding a unicycle");
    }

    public void balance() {
        System.out.println("Balancing a unicycle");
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Riding a bicycle");
    }

    public void balance() {
        System.out.println("Balancing a bicycle");
    }
}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Riding a tricycle");
    }
}

