public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        //NOTE A string is a collection of characters..
        char c[] = {'A','B','C','D'};

        String str1 = new String(c); // we created a new object str1, with literal ABCD;
        System.out.println(str1);

        // Let's declare a byte array
        byte b[] = {10,65,100,43};

        String str2 = new String(b);
        System.out.println(str2);

        String str3 = new String("Java");
        System.out.println(str3);
    }
}