public class StringObjects {
    public static void main(String[] args){
        String str1 = "Java Program"; // the portion with 'Java Program' is called a string literal
        String str2=new String("Java");

        byte b[] = {65,66,67,68};
        String str4 = new String(b,1,2);
        System.out.println(str4);
    }
}
