package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int value1 = 0;
        int value2 = 1;
        int value3;
        System.out.println(value1 + "\n" + value2);
        for (int i = 3; i <= lastFibonacci; i++) {
            value3 = value1 + value2;
            System.out.println(value3);
            value1 = value2;
            value2 = value3;
        }
    }
}
