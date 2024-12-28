import java.util.*;

public class _14_BitManupulation {

    //Get Bit
    public static int getbit(int x, int pos) {
        int bitMask = x & (1 << pos);
        if (bitMask != 0) {

            return 1;
        } else {
            return 0;
        }
    }

    //Set Bit
    public static int setbit(int x, int pos) {
        int bitMask = x | (1 << pos);
        return bitMask;
       
    }
    //Clear Bit
    public static int Clearbit(int x, int pos) {
        int bitMask = x & (~(1 << pos));
        return bitMask;
       
    }

    public static void main(String args[]) {

        System.out.println(getbit(5, 2));
        System.out.println(setbit(5, 1));
        System.out.println(Clearbit(5, 2));
    }
}

//Summary
// Get Bit : x & (1 << pos)
//Set Bit : x | (1 << pos)
// Clear Bit : x & (~(1 << pos))