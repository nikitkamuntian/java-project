package academy.devonline.java.basic.section05_cycles;

public class NestedCycles {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i*10+j+1)+"\t");
            }
            System.out.println();
        }
    }
}
