public class _03pattern3 {
    public static void main(String args[]) {
        int n = 5;
        // loop for row
        for (int i = 1; i <= n; i++) {
            // loop for colm
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 1
// 12
// 123
// 1234
// 12345