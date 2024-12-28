import java.util.*;

public class _29_Rec_Understanding {
    public static void reachHome(int src, int des) {

        System.out.println("Source " + src + " " + "destination " + des);
        
        if (src == des) {
            System.out.println("Ghar pauch gye");
            return;

        }
        // src++;
        reachHome(src + 1, des);
    }

    public static void main(String args[]) {
        int des = 10; // Home
        int src = 1; // I'm At
        reachHome(src, des);
    }
}