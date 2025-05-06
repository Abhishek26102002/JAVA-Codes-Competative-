public class _05pattern5 {
    public static void main(String args[]) {
        int n = 5;
        // 1
        // 01
        // 010
        // 1010
        // 10101
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++cnt % 2);
            }
            System.out.println();

        }
    }
}
