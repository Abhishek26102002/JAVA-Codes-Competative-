import java.util.*;

public class _02Base10Comp {
    public static void main(String args[]) {
        int n = 5 ;
        System.out.println(n + " has the binary form " + Integer.toBinaryString(n));
        
        int mask = 0;
        int temp = n;
        if(n==0){
            System.out.println("ans is 0");
        }
        while (temp != 0) {
            mask = mask << 1;
            mask = mask | 1;
            temp = temp >> 1;
        }
        
        int ans = mask & (~n);
        System.out.println("ans :"+ans + ", in ()_10 -> " + Integer.toBinaryString(ans));
    }
}
