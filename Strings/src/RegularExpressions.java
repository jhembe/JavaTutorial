public class RegularExpressions {
    public static void main(String[] args){
        // regular expressions deal with string patterns.
        String str1 = "ab";
        String str2 = "c";
        String str3 = "A8";

        System.out.println(str1.matches("ab "));
        System.out.println(str1.matches("."));
        System.out.println(str2.matches("[abc]"));
        System.out.println(str2.matches("[^XYZ]"));
        System.out.println(str2.matches("[a-zA-Z1-7]"));
        // for multiple alphabets
        System.out.println(str3.matches("[A-Z][0-9]"));


        // FOR META CHARACTERS
        String str4 = "a";
        System.out.println(str4.matches("\\w"));
        System.out.println(str4.matches("\\W"));

        String str5 = "6";
        System.out.println(str4.matches("\\d"));

        // FOR QUANTIFIERS
        String str6 = "Hello  ";
        System.out.println(str6.matches("[a-zA-Z\\s]{1,8}"));

        // email pattern
        String email = "jhembe202@gmail.com";
        System.out.println(email.matches(".*gmail.*"));

    }
}
