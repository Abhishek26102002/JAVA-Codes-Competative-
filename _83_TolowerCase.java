import java.util.*;

public class _83_TolowerCase {
    public static char TolowerCase(char str) {
        if (str >= 'a' && str <= 'z') {
            return str;
        } else {
            char temp = (char) (str - 'A' + 'a');  // very imp U to low
            //L to U :: char temp = (char) (str - 'a' + 'A')
            return temp;
        }

    }

    public static void main(String[] args) {

        char str = 'S';
        System.out.println(TolowerCase(str));

    }
}