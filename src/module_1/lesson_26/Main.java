package module_1.lesson_26;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, Month.AUGUST, 22);
        LocalDate fiveMonthsAgo = localDate.minusMonths(5);
        System.out.println(localDate);
        System.out.println(fiveMonthsAgo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy VV");

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        Instant instant = Instant.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Belgrade"));
        System.out.println(formatter.format(zonedDateTime));
    }

    private static void calendarExample() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2030);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.getTime());
    }

    private static void dateExample() {
        Date date = new Date();
        System.out.println(date);
        Date another = new Date(date.getTime() + 3 * 60 * 60 * 1000);

        Date date2 = new Date(125, 0, 3);
        System.out.println(date2);

        // dd-/-MM-/-yyyy
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy EE");
        System.out.println(dateFormat.format(date));
    }
}
