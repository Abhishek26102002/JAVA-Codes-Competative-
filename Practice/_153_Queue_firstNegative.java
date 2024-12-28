import java.util.ArrayDeque;
import java.util.Deque;

public class _153_Queue_firstNegative {

    // Normal Method window Sliding
    public long[] printFirstNegativeInteger(long A[], int N, int K) {

        long arr[] = new long[N - K + 1];
        // arr ele initialize with zero . So no need to manually enter '0' after we dont
        // find the negative its auto skip the index i.e initially was zero

        for (int i = 0; i < N - K + 1; i++) {
            for (int j = i; j < i + K; j++) {
                if (A[j] < 0) {
                    arr[i] = A[j];
                    break;
                }
            }
        }

        return arr;

    }

    // -------------------- DeQueue Method----------------

    public long[] printFirstNegativeInteger1(long A[], int N, int K) {
        Deque<Long> dq = new ArrayDeque<>();
        long[] ans = new long[N - K + 1];
        int count = 0;

        for (int i = 0; i < K - 1; i++) {
            if (A[i] < 0) {
                dq.add(A[i]);
            }
        }

        for (int i = K - 1; i < N; i++) {
            if (A[i] < 0) {
                dq.add(A[i]);
            }
            if (!dq.isEmpty()) {
                ans[count] = dq.peek();
                if (dq.peek() == A[i - K + 1]) {
                    dq.poll();
                }
            } else {
                ans[count] = 0;
            }
            count++;
        }
        return ans;

    }
}
