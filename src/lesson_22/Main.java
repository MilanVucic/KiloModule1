package lesson_22;

public class Main {
    public static void main(String[] args) {
        MessageStatus status = MessageStatus.NOT_SENT;
        String message = switch (status) {
            case NOT_SENT -> {
                System.out.println("....");
                System.out.println("....");
                System.out.println("....");
                System.out.println("....");
                yield "Nope";
            }
            case SENT -> "Gone";
            case DELIVERED -> "Got it";
            case READ -> "Reddit";
        };


    }

    private enum MessageStatus {
        SENT,
        READ,
        DELIVERED,
        NOT_SENT
    }

    static void breakLabel() {
        ANYTHING:
        while (true) {
            int i = 50;
            while (i > 0) {
                System.out.println(i);
                i--;
                if (i == 23) {
                    break ANYTHING;
                }
            }
        }
    }
}
