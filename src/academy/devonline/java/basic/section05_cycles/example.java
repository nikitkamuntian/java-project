package academy.devonline.java.basic.section05_cycles;

public class example {
    public static void main(String[] args) {
        var from = 1;
        var to = 100;
        var cols = 10;

        for (int i = from; i <= to; i++) {
            System.out.print(i + "\t");

            if(i % cols == 0) {

                System.out.println();
            }
        }
    }
}
