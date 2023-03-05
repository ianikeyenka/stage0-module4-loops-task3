package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int value = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            value += i;
        }
        System.out.println(value);
    }
}
