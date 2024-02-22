package main;

public class Complexity {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Runtime rt = Runtime.getRuntime();
        long prevTotal = 0;
        long prevFree = rt.freeMemory();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        //System.out.println("F iterative = " + Fibonacci.iterativeF(30));
        //System.out.println("F dynamic = " + Fibonacci.dynamicF(30));
        System.out.println("F recursive = " + Fibonacci.recursiveF(30));

        if (total != prevTotal || free != prevFree) {
            System.out.println(
                    String.format("Total: %s, Free: %s, Diff: %s",
                            total,
                            free,
                            total - free));}
        long endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime - startTime));
    }
}
