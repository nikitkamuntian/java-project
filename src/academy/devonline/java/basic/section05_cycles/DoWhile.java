package academy.devonline.java.basic.section05_cycles;

public class DoWhile {
    public static void main(String[] args) {
        var i = 100;
        while (i >= 1) {
            System.out.print(i-- + " ");
        }
        System.out.println();
    }
    {
        var i = 100;
        do {
            System.out.print(i-- + " ");
        } while (i >= 1);
        System.out.println();
    }
}
