import  java.util.*;
public class _02_Char {
    public static void main(String[] args) {
        char sampleChar = 'a';
        char digitChar = '9';
        char upperChar = 'A';
        char spaceChar = ' ';

        // isDigit
        Character.isDigit(digitChar);  // true

        // isLetter
        Character.isLetter(sampleChar);  // true

        // isWhitespace
        Character.isWhitespace(spaceChar);  // true

        // isUpperCase
        Character.isUpperCase(upperChar);  // true

        // isLowerCase
        Character.isLowerCase(sampleChar);  // true

        // toUpperCase
        Character.toUpperCase(sampleChar);  // 'A'

        // toLowerCase
        Character.toLowerCase(upperChar);  // 'a'

        // toString
        Character.toString(sampleChar);  // "a"

        // isLetterOrDigit
        Character.isLetterOrDigit(sampleChar);  // true

        // getNumericValue
        Character.getNumericValue(digitChar);  // 9

        // isAlphabetic
        Character.isAlphabetic(sampleChar);  // true

        // isDefined
        Character.isDefined(sampleChar);  // true

        // digit (parse 'A' in base 16)
        Character.digit(upperChar, 16);  // 10
    }
}
