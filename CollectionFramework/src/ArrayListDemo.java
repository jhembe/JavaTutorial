import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // initializing the array list
        ArrayList<Integer> arl1 = new ArrayList<>();
        ArrayList<Integer> arl2 = new ArrayList<>(3);
        ArrayList arl4 = new ArrayList(List.of(45,34,"Hello","there",true,false,0.456,65.9,34));

        System.out.println(arl4);
        Iterator it = arl4.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//
//        // second method of printing out
        for(Iterator mt = arl4.iterator(); mt.hasNext();){
            System.out.println(mt.next());
        }
        // printing lambda expressions
        arl4.forEach(i-> System.out.println(i));
        arl4.forEach(System.out::println);

        arl4.remove(true);
        arl4.removeAll(arl2);
        System.out.println(arl4);
        System.out.println(arl4.isEmpty());
        System.out.println(arl4.contains(false));
        System.out.println(arl4.containsAll(arl1));
        System.out.println(arl4.equals(false));

        arl2.add(12);
        arl2.add(11);
        arl2.add(45);

        arl1.add(10); //0
        arl1.add(34); // 1
        arl1.add(1,456);
        arl1.addAll(2,arl2);

        // another way to initialize the list is by using the List.of(34,56,76,34,56,23)
        ArrayList<Integer> arl3 = new ArrayList<>(List.of(34,56,76,34,56,23));
        arl1.addAll(5,arl3);

        System.out.println(arl1);
        System.out.println(arl2);
        System.out.println(arl3);

        System.out.println(arl1.contains(76)); // checks if the element is there or not

        System.out.println(arl1.get(4)); // returns the object at an index
//
        arl1.set(9,54);
        System.out.println(arl1);

        int sum=0;
        for (int i = 0; i < arl1.size();i++){
            sum+=arl1.get(i);
//            System.out.println(arl1.get(i));
        }
        System.out.println(sum);

        for(var i:arl1){
            System.out.println(i);
        }



        for (var integer : arl1) {
            System.out.println(integer);
        }
//
        // we can use for iterator
        Iterator<Integer> mit = arl1.iterator();
        while (mit.hasNext()){
            System.out.println(mit.next());
        }

        for (Iterator<Integer> mi = arl2.iterator();mi.hasNext();){
            System.out.println(mi.next());
        }


            arl1.forEach(i-> System.out.println(i));
            arl1.forEach(System.out::println);
            arl4.clone();
            arl4.get(6);
            arl4.set(4,true);
        System.out.println(arl4);
//        System.out.println(arl4.sort());
//        // using a lambda expresson
//        arl1.forEach(n-> System.out.println(n));
//        //or
//        arl1.forEach(System.out::println);

        // another method is List Iterator
//        ListIterator<Integer> list = arl1.listIterator();
//        while (list.hasNext() || list.hasPrevious()){
//            System.out.println(list.hasNext() +" "+ list.hasPrevious());
//        }

    }
}
