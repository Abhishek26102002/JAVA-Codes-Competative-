import java.util.*;

// thora sa error ho skta hai output mai accordingly chang kr lena
public class _34_Rec_stair {
    public static int nStaretoTop(int nStair) {
        if (nStair < 0) {
            return 0;
        }
        if (nStair == 0) {
            return 1;
        }

        return nStaretoTop(nStair - 1) + (nStair - 2);
    }

    public static void main(String args[]) {
        int n = 3;
        int ans = nStaretoTop(n);
        System.out.println(ans);
    }
}