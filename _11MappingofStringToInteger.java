import java.util.*;

public class _11MappingofStringToInteger {

    public static void main(String args[]) {
        String digit="23";
        String[] Keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        for(int i=0;i<digit.length();i++){

            int currentChar=digit.charAt(i)-'0';// give integer from a Char
            String mapping=Keypad[currentChar];
    
            System.out.println(currentChar);
            System.out.println(mapping);
        }
    }
}