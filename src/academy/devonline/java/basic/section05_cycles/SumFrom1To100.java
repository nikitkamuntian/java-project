package academy.devonline.java.basic.section05_cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;

        var sum=0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
