package main;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("F iterative = " + iterativeF(20));
        System.out.println("F dynamic = " + dynamicF(20));
        System.out.println("F recursive = " + recursiveF(20));
    }

    public static int iterativeF(int n) {
        int current = 1;
        int prev = 1;
        int preprev = 0;
        for (int i = 2; i <= n; i++) {
            current = preprev + prev;
            preprev = prev;
            prev = current;
        }
        return current;
    }

    public static int dynamicF(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int fib = dynamicF(n - 1) + dynamicF(n - 2);
        memo.put(n, fib);
        return fib;
    }

    public static int recursiveF(int n) {
        return n < 2 ? n : recursiveF(n - 1) + recursiveF(n - 2);
    }
}
