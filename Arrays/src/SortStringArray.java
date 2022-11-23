public class SortStringArray {
    public static void main(String[] args){
        // here we want to sort an array of strings
        String[] array={"Java","Python","Pascal","Smalltalk","Ada","Basic"};

        java.util.Arrays.sort(array);
        // using for each loop i'll print all the objects within the string array
        for(String x :array){
            System.out.print(x + " ");
        }


    }
}
