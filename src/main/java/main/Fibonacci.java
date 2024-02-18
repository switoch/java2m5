package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("F iterative = " + iterativeF(20));
        System.out.println("F dynamic = " + dynamicF(20));
        System.out.println("F recursive = " + recursiveF(20));
    }

    public static int iterativeF(int n) {
        List<Integer> arr = new ArrayList<>(n);
        arr.add(0);
        arr.add(1);
        for (int i = 2; i <= n; i++) {
            arr.add(i, arr.get(i - 1) + arr.get(i - 2));
        }
        return arr.get(n);
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
