package java21.com.jse17.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        //
        var date = LocalDate.of(2022, 04, 20);
        var time = LocalTime.of(10, 04, 20);
        var dateTime = LocalDateTime.of(date, time);
        var zoneId = ZoneId.systemDefault();
        ZonedDateTime zDateTime = ZonedDateTime.of(dateTime, zoneId);
        System.out.println(zDateTime);

        //Instant
        System.out.println(zDateTime.toInstant());
        System.out.println(dateTime.toInstant(ZoneOffset.ofHours(7)));

        //Period
        var period = Period.ofDays(10).plus(Period.ofDays(10));
        var duration = Duration.of(1, ChronoUnit.DAYS).plus(Duration.ofMinutes(5));
        System.out.println(period);
        System.out.println(duration);
    }
}
