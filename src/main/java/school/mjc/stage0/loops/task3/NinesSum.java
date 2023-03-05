package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int value = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            value = (int) ((double) 10 / 9 * Math.pow(10, i)) * 9 + value;
        }
        System.out.println(value);
    }
}
