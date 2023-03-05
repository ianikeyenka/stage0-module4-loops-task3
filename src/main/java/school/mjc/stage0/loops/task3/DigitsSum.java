package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        for (int i = 0; i < Integer.toString(t).length(); i++) {
            sum += (Math.abs(t / Math.pow(10, i))) % 10;
        }
        System.out.println(sum);
    }
}
