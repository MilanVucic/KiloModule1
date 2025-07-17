package module_1.lesson_2;

public class Part1 {
    public static void main(String[] args) {
        String firstName = "Milan";
        String lastName = "Vucic";
        int age = 30; // "30"
        double height = 185.4; // "185.4"
        String fullName = "Mister " + firstName + " " + lastName +
                " age: " + age + " height: " + height;
        System.out.println(fullName);

        String input = "123";
        int converted = Integer.parseInt("555");
        System.out.println(converted + 20);
        String message = String.valueOf(converted);
        String message2 = "" + converted;
    }
}

