import java.util.Arrays;

public class _78_String_RemoveSpaces {
    public static String StringReplace(String str, String whaString) {
        String temp = "";

        int count = 0;
        while (count != str.length()) {

            if (str.charAt(count) == ' ') {
                temp = temp + whaString;
            } else {
                temp = temp + str.charAt(count);
            }
            count++;
        }
        return temp;
    }

    public static void main(String args[]) {
        String str = "Abhishek is my name";

        String WhatString = "@40";
        System.out.println(StringReplace(str, WhatString));

    }
}