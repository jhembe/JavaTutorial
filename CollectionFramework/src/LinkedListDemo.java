import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>(List.of(12,54,67,76,45,54,23,54));

        list.add(18);
        list.add(55);
        list.addAll(list1);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        Iterator it = list.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // extras for linkedList
        //1 Add first
        // i'll add 100 at begining
//        list.addFirst(100);
        //2 Add Last
//        list.addLast(900);
        // we can do the same for removing the list
//        System.out.println(list.peek());

//        list.forEach(System.out::println);
    }
}
