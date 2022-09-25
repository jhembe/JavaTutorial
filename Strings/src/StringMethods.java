public class StringMethods {
    public static void main(String[] args){

        String str = "Java";
        // now I want to print out the length of the string
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        // string objects cannot be modified. Hence, when changing cases and string manipulation
        // Java actually makes a new string object and manipulates that
        // to change the original object, we have to store the new object to the old one
        str = str.toUpperCase();
        System.out.println("This is my new str : "+str);

        String str2 = "  Hello welcome  ";
        System.out.println(str2.trim()); // creates new objects, with removed backspaces

        // for substring() method
        String str3 = "Welcome";
        System.out.println(str3.substring(2));
        System.out.println(str3.substring(1,7));

        // replace() method - old character with new char
        System.out.println(str3.replace('e','k'));


    }
}
