package lesson_8;

public class VoidReturn {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(17));
        System.out.println(isPrime(99));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printHello(String name, int count) {
        if (count <= 0) {
            int d = 50;
            return;
        }
        for (int i = 0; i < count; i++) {
            int d = 50;
            if (i < 30) {
                int d1 = 513;
                System.out.println(d);
                System.out.println(d);
            }
            System.out.println("HELLO " + name);
        }
    }
}
