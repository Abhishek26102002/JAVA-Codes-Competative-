import java.util.*;
    // Reverse a string and return Char by Char
public class _84_StringScanner {
    public static void swap(char[] charArray,int left, int right){
        char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
    }
    
    public static void rev(char[] charArray){
        int left=0, right=charArray.length-1;
        while(left<right){
            swap(charArray, left, right);
            left++;
            right--;
        }

    }
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter characters without spaces:");
    String input = scanner.nextLine();
    char[] charArray = input.toCharArray();

    rev(charArray); // method call

    // Display the char array for verification
    for (char c : charArray) {
        System.out.print(c + " ");
    }
    
    }
}