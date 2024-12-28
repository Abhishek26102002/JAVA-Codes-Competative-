import java.util.ArrayList;

public class _45_NonRepDigit {

	public static void countUniqueDigits(int N) {
		int res = 0;
		int cnt[] = { 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0 };

		while (N > 0) {
			int rem = N % 10;
			cnt[rem]++;
			N = N / 10;
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == 1) {
				res++;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		int N = 292;
		countUniqueDigits(N);
	}
}

class temp {

    private static ArrayList<Integer> uniq(int num) {
        ArrayList<Integer> a = new ArrayList<>();

        int[] arr = new int[10]; // 0 to 9

        while (num > 0) {
            int rem = num % 10;
            arr[rem]++;
            num = num / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                a.add(i);
            }
        }

        return a;
    }

    public static void main(String args[]) {
        int num = 292;
        // ans array could be of size 0 <= ansArray <= nums.length

        for(int x: uniq(num)){
            System.out.print(x+" ");
        }
       

    }

}