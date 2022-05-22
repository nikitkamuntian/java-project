package academy.devonline.java.basic.section04_conditional;

/*Реализовать программу LeapYear, которая проверяет введенный пользователем год на предмет является ли он високосным или нет.

        Алгоритм проверки является ли год високосным (Алгоритм взят из википедии):

        год, номер которого кратен 400, — високосный;

        остальные годы, номер которых кратен 100, — невисокосные;

        остальные годы, номер которых кратен 4, — високосные;

        остальные годы - невисокосные. */

public class LeapYear {
    public static void main(String[] args) {
        var year = 2021;
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }
        System.out.println(isLeap ? year + " is leap year " : year + " is not leap year ");
    }
}
