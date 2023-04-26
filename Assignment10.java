//Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).

Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.

import java.util.*;

public class Assignment10 {
    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SList.SListIterator<Integer> iterator = list.iterator();
        for (int i = 1; i <= 5; i++) {
            iterator.insert(i);
            iterator.next();
        }
        iterator.insert(9);

        // Reset the iterator to the beginning of the list
        iterator = list.iterator();

        // Remove the second element
        iterator.next();
        iterator.remove();

        System.out.println(list);
    }
}

class SList<T> {
    private static class Link<T> {
        T data;
        Link<T> next;

        Link(T data, Link<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private  Link<T> head = null;

    public SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        SListIterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static class SListIterator<T> {
        private Link<T> current;
        private Link<T> previous;

        SListIterator(Link<T> current) {
            this.current = current;
            this.previous = null;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T result = current.data;
            previous = current;
            current = current.next;
            return result;
        }

        public void insert(T data) {
            Link<T> newLink = new Link<T>(data, current);
            if (previous == null) {
                // inserting at the beginning of the list
                head = newLink;
            } else {
                previous.next = newLink;
            }
            previous = newLink;
        }

        public void remove() {
            if (current == null) {
                throw new IllegalStateException();
            }
            if (previous == null) {
                // removing the head element
                head = current.next;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }
    }
}
