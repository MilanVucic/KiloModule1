package module_1.lesson_13;

public class Util {

    public static String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static boolean checkPasswordValidity(String input) {
        return input.length() > 10;
    }

    public static String readFileContents(String filename) {
        return "";
    }
}
