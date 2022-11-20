public class Main {
    public static void main(String[] args) {
        // How to initialize arrays in Java
        int[] array = new int[10];
        int[] arrayOne = {2,4,4,2,3};
        int[] arrayTwo;
        arrayTwo = new int[5];

        // let's access elements in arrayOne
        for(int i=0; i<arrayOne.length; i++){
            System.out.print(arrayOne[i] + " ");
        }

        System.out.println("\n");

        for(int i=0; i<array.length;i++){
            System.out.print(array[i]++);
        }

        System.out.println("\n");

        // using foreach 
        for (int x:array)
        {
            System.out.print(x + " ");
        }

        // let's try to print an array identifier or name;
        System.out.println("\n");
        System.out.println(array);
    }
}