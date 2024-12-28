public class _37_Rec_RemoveDuplicates {

    public static boolean[] boolArray = new boolean[26];//declearing a boolean type array

    public static void Duplicate(String str, String newstr, int s) {

        if (s == str.length()) {
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(s);

        //ele already present
        if (boolArray[current - 'a'] == true) {
            Duplicate(str, newstr, s + 1);
        }
        
        // ele meeting first the first time
        else {
            newstr += current;//strore char
            boolArray[current - 'a'] =true;// Update boolear array
            Duplicate(str, newstr, s + 1);//go ahead or call the function again

        }
    }

    public static void main(String args[]) {
        String str = "abhishekshaw";
        String newstr = "";
        Duplicate(str, newstr, 0);

    }
}