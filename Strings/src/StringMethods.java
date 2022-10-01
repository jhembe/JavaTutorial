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

        // starts with method startsWith()
        String str4 = "https://www.google.com";
        System.out.println(str4.startsWith("https"));
        System.out.println(str4.endsWith(".com"));

        // char at method charAt()
        String str5 = "hello";
        System.out.println(str5.charAt(2));

        // index of a character method indexOf()
        String str6 = "habari";
        System.out.println(str6.indexOf('a'));

        // last index within a string method
        System.out.println(str6.lastIndexOf('r'));

        // equals method
        String str7 = "JAVA";
        String str8 = str7.toLowerCase();
        String str9 = "python";
        String str10 = "python";

        System.out.println(str7.equals(str8));
        System.out.println(str9.equals(str10));

        // equalsIgnoreCase
        System.out.println(str7.equalsIgnoreCase(str8));
        System.out.println(str7.equalsIgnoreCase(str10));

        // compareTo method. It compares which string comes first in dictionary order
        System.out.println(str8.compareTo(str9));
        System.out.println(str9.compareTo(str8));
        // the answer gives 0 if the both strings are equal

        // The contains method
        String wall = "The great wall of china";

        String str11 = "The great wall";
        String str12 = " of china";
        System.out.println(wall.contains("great"));
        System.out.println(str11.concat(str12));

        // valueOf() method
        String str13 = "here i am";
        System.out.println(str11.valueOf(str13));
    }
}
