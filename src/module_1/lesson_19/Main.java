package module_1.lesson_19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int choice = 1;
        switch (choice) {
            case 0: case 5:
                System.out.println("Im zero or 5");
                break;
            case 1:
                System.out.println("Im one");
                break;
            case 2:
                System.out.println("Im two");
                break;
            case 3:
                System.out.println("Im three");
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private static void enumS() {
        Month m = Month.JUNE;
        Month[] values = Month.values();
        System.out.println(Arrays.toString(values));
        System.out.println(m.ordinal());
        System.out.println(Month.JANUARY.ordinal());
        String someMonth = "APRIL";
        Month month = Month.valueOf("DECEMBER");
        System.out.println(month);
        int monthNum = 3;
        Month month2 = Month.values()[monthNum];
        System.out.println(month2);
        System.out.println(Month.AUGUST.getShortName());
        Singleton singleton = Singleton.getInstance();
    }
}
