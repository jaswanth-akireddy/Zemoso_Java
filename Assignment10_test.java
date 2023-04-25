public class Assignment10_test {
    public static void main(String[] args) {
        SList myList = new SList();
        SList.SListIterator iterator = myList.iterator();

        iterator.insert(1);
        iterator.insert(2);
        iterator.insert(3);

        System.out.println(myList); // prints "1, 2, 3"

        iterator.remove();

        System.out.println(myList); // prints "1, 3"

        iterator.insert(4);

        System.out.println(myList); // prints "1, 4, 3"
    }
}

 
