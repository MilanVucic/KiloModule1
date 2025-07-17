package module_1.lesson_2;

public class Part3 {
    public static void main(String[] args) {
        // 1 - bit -> 2 -> 0, 1
        // __ -> 4 -> 00, 01, 10, 11
        // ___ -> 8 -> 000, ... , 111
        // ____ -> 16 -> ....
        // X bits -> 2*2*2...*2 = 2^x
        // byte = 8 bits
        // 2^8 = 256
        // 500 MBit/s -> 62.5 MBytes

        byte b = 127;
        // 2^16
        short shorty = -32768;
        long longy = 189239871239721798L;

        float floaty = 5.6f;
        double doubly = 5.6;
    }
}
