package module_1.lesson_10;

public class Main {
    public static void main(String[] args) {
        // Decimal - 10
        // Base = 10, digits = 0,1,2,3,4,5,6,7,8,9
        // 43210 - powers of BASE
        // 18573 -> 8000 + 500 + 70 + 3 = 1 * 10^4 + 8 * 10^3 + 5 * 10^2 + 7 * 10^1 + 3 * 10^0

        // Binary - 2
        // Base = 2, digits = 0,1
        // 43210
        // 11101 -> 1 * 2^4 + 1 * 2^3 + 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 16 + 8 + 4 + 1 = 29
        // 29 -> 16 + 13 = 16 + 8 + 5 = 16 + 8 + 4 + 1 -> 11101
    //                               210
        // 30 -> BASE 5 -> 25 + 5 -> 110
        // 80 -> BASE 5 -> 3 * 25 + 1 * 5 + 0 * 1 = 310

        // Hexadecimal - 16
        //                                     A   B   C   D   E   F
        // Base = 16, digits = 0, 1, 2,..., 9, 10, 11, 12, 13, 14, 15
        // 210
        // 2FA -> 2 * 16^2 + F * 16^1 + A * 16^0 = 2 * 256 + 15 * 16 + 10 = 512 + 240 + 10 = 762

        // 1101 -> 13 -> D
        // 1000 1101 -> 8D
        // AB57 -> 1010 1011 0101 0111


        // 0 -> A
        // 1 -> B
        // 2 -> C...

        StringBuilder stringBuilder = new StringBuilder("asdasd");
        stringBuilder.append(" asd")
                .append("asdasd")
                .delete(2, 5)
                .insert(3, "aasd");
        String ready = stringBuilder.toString();

        String name = "Milan";
        int age = 31;
        double height = 185.123123;
        System.out.println("Hello {name}");
        String formatted = String.format("Hello %s %d %.2f", name, age, height);
        System.out.println(formatted);
    }
}
