class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension cannot be negative";
    }
}
public class ThrowThrows {
    static int area(int l,int b) throws Exception{
        if (l < 0 || b < 0) {
//            throw new Exception("Don't pass a negative number");
            throw new NegativeDimensionException();
        }
        int a = l*b;
        return a;
    }

    static int meth1() {
        int a = 0;
        try {
            a = area(-20, 34);
        } catch (NegativeDimensionException e) {
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return a;
    }

    public static void main(String[] args) {
        meth1();
    }

}
