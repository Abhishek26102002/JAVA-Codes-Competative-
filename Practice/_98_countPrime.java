import java.util.*;
import java.util.Arrays;

// Given an integer n, return the number of prime numbers that are strictly less than n.

// time Complexity =O(n*log(log n))

//method - Sieve of Eratosthenes

public class _98_countPrime {

    public static int primeSieve(int n) {

        int count = 0;

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
                for (int j = i * i; j < n; j += i) {
                    System.out.println(j);
                    prime[j] = false;
                }
            }

        }

        return count;
    }

    public static void main(String args[]) {
        int n = 50;
        System.out.println(primeSieve(n));
    }
}