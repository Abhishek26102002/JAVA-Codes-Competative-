import java.util.*;

public class _01_String {
    public static void main(String args[]) {

        "length of String".length();

        // give index of *word
        "index of ".indexOf("of");

        // last index of word
        "LAst index of ".lastIndexOf("a");

        // compare two strings
        "is equals".equals("equal ?"); // boolean

        "Equals Ignore CASE".equalsIgnoreCase("equals"); // booleans

        "Starts with".startsWith("hell"); // boolean

        "LOWER CASE".toLowerCase();

        "upper case".toUpperCase();

        // trim spaces from fornt and back but not from middle
        "    Trim white spaces    ".trim();

        "    Trim white spaces    ".strip();



        "Replace only rrrr".replace("r", "t");

        "Contains ?".contains("an ele"); // boolean

        //split special character 
        "can,split,someting,as,comma".split(",");

        // method to convert string to array   {
        String str1 ="split.some.sentences";
        String[] fruits =str1.split(".");
        // }

        //--------------------------------------------------------
        //** add interger, float, double,  boolean to a string
        String.valueOf(123);


        // join a delimeter to the strinng
        String.join("-","World", "HEllo");

        "IS empty ?".isEmpty(); // boolean


        "join two".concat("Strings");

        "SubStringStarts With Index".substring(4, 10);

        "123445".matches("//d+"); //d+ is a method for checking integers

        "replace.all.occ.of.dot.special.to.space".replaceAll("."," ");

        "Replace First `=` only = = =".replaceFirst("=", " ");


        "repeat a String".repeat(3);


        // transform a val of String to any varibale type
        "123".transform(Integer::valueOf);

        // copy Char to Array
        char[] CharArry={'j','a','v','a'};
        String.copyValueOf(CharArry);
        //



        

    }

}