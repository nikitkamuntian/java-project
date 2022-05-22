package academy.devonline.java.basic.section04_conditional;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        var day = 70;

        switch (day) {
            case 1: {
                System.out.println("понедельник");
                break;
            }
            case 2: {
                System.out.println("вторник");
                break;
            }
            case 3: {
                System.out.println("среда");
                break;
            }
            case 4: {
                System.out.println("четверг");
                break;
            }
            case 5: {
                System.out.println("пятница");
                break;
            }
            case 6: {
                System.out.println("суббота");
                break;
            }
            case 7: {
                System.out.println("воскресенье");
                break;
            }
            default: {
                System.out.println("неправильный день недели: " + day);
            }
        }
    }
}
