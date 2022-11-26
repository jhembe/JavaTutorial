public class MethodOverloading {
    // here we'll do some little examples to showcase method overloading
    static int max(int x, int y){
        return x>y?x:y;
    }

    static float max(float x, float y){
        return x>y?x:y;
    }

    public static void main(String[] args){
        System.out.println(max(4,5));
        System.out.println(max(4f,34f));
    }
}
