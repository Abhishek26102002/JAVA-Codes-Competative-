import java.util.*;

public class _104_Rec_ApowB {
    public static int apowb(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (a == 0) {
            return 0;
        }
        int ans = apowb(a, b / 2);
        // if b is even
        if (b % 2 == 0) {

            return ans * ans;

        } else {
            return a * ans * ans;
        }
    }

    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter x : where x^y");
        int a = scan.nextInt();
        System.out.println("Enter y : where x^y");
        int b =  scan.nextInt();

        System.out.println(a+"^"+b +" is:");
        int ans = apowb(a, b);
        System.out.println(ans);

    }
}

// import java.util.*;

// public class apowb_recursion {
//     public static int apowb(int a, int b){
//         if(b==0){
//             return 1;
//         }
//         if(b==1){
//             return a;
//         }
//         if(a==0){
//             return 0;
//         }
//         return a*apowb(a, b-1);// no of iteration equals to no of b -- time and space incereases
//     }
//     public static void main(String args[]){
//     int a=3;
//     int b=1;

//     int ans =apowb(a ,  b);
//     System.out.println(ans);

//     }
// }
