import java.util.*;

public class ArrayListLibrary {
    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList<>(List.of("Pass like a shaddow","Hawa The bus driver","Mama Ntilie"));
        library.add("Wasakatonge");
        library.add("Ngoswe");
        library.add("Three suitors");

//        for(int i=0; i<library.size();i++){
//            System.out.println(library.get(i));
//        }

        Iterator it = library.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        for (String s:library) {
//            System.out.println(s);
//        }

//        library.forEach(System.out::println);
//        library.forEach(i-> System.out.println(i));



    }


}
