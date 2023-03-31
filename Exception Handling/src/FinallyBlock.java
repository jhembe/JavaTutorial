public class FinallyBlock {
    static void meth1()throws ArithmeticException{
        try{
            throw new ArithmeticException();
        }
        finally {
            System.out.println("FInal message");
        }


    }
    public static void main(String[] args) {
//        meth1();
        // adding the try and finally block
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Divisor should be greater than zero : "+ e);
        }
        System.out.println("Final Message");
//        finally {
//            System.out.println("Final Message");
//        }

    }
}
