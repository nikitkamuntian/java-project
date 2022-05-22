package academy.devonline.java.basic.section02_structure;

public class Var {
    public static void main(String[] args) {
        var text = "Hello World";
        System.out.println(text);

        text = "hui";
        System.out.println(text);

        text = "Hello" + System.getProperty("user.name");
        System.out.println(text);
    }
}
