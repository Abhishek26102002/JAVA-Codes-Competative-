import java.util.*;

public class _33TowerOfHenoi {
    public static void TOH(int n, char src, char help, char dest) {
        if (n == 0) {
            return;
        }
        //Orginally S H D
        TOH(n - 1, src, dest, help);
        
        System.out.println("move disk " + n + " from " + src + " to " + dest);
        
        //Orginally S H D
        TOH(n - 1, help, src, dest);
    }

    public static void main(String[] args) {

        int n = 2;// no of Disk

        TOH(n, 'S', 'H', 'D');
    }
}