public class _05pattern5 {
    public static void main(String args[]) {
        int n = 5;
        int sum = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (sum % 2 == 1)
                    System.out.print("1");
                else
                    System.out.print("0");
                sum += 1;
            }
            System.out.println();
        }
    }
}
// 1
// 01
// 010
// 1010
// 10101

// or
class temp {

    public static void main(String args[]) {
        int n = 5;

        for (int i = 0; i <= n; i++) {
            boolean isTrue = true;

            for (int j = 0; j < i; j++) {
                if (isTrue) {
                    System.out.print('1');
                    isTrue = false;
                } else {
                    System.out.print('0');
                    isTrue = true;
                }
            }
            System.out.println();
        }
    }
}