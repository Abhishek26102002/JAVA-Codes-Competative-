public class _44_SumOfUniqDigit {
    public static int sumCount(int n) {
        int[] a = new int[10];

        while (n > 0) {
            int rem = n % 10;
            a[rem]++; // set each ele of arr to 1
            n = n / 10;
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String ars[]) {
        int n = 2921;
        // unique eles are 9 and 1 as '2' repeated twice
        // sum=9+1 => 10
        System.out.println(sumCount(n));
    }
}