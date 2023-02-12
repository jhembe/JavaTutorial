public class NestedCatch {
    public static void main(String[] args) {
        int[] A={30,20,10,40,0};

        try {
            int c = A[0]/A[1];
            System.out.println("The division is : " + c);

            try{
                // creating an outside of array bound issue
                System.out.println(A[5]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array is out of Bound");
            }

        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
        }



//        try {
//            int c = A[0]/A[1];
//            System.out.println("The division is : " + c);
//
//            // creating an outside of array bound issue
//            System.out.println(A[5]);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Division by 0 is not allowed");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("The array is out of Bound");
//        }

        System.out.println("Bye");

    }
}
