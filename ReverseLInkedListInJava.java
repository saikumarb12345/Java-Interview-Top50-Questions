package Java50;

import java.util.LinkedList;

public class ReverseLInkedListInJava {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(4);

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll.descendingIterator().forEachRemaining(ll1::add);

        System.out.println(ll1);
    }
}
