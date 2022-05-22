package academy.devonline.java.basic.section05_cycles;

public class infLoopProblem {
    public static void main(String[] args) {
        long time = System.nanoTime();

        for (int i = 0; i <i+Integer.MAX_VALUE; i++) {
            System.currentTimeMillis();
        }
        long result = System.nanoTime() - time;
        System.out.println((double) result/1_000_000_000 + "sec");
    }
}
