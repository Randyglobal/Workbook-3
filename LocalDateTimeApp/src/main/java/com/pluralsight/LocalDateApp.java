package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateApp {
    public static void main(String[] args) {
//     call in the localDate Class
        LocalDate today = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter fmtOnDate = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        DateTimeFormatter fmtOnYear = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmtOnMonth = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter fmtOnDay = DateTimeFormatter.ofPattern("EEEE , MMM d, yyyy h:mm a", Locale.US);
        DateTimeFormatter localTimeZone = DateTimeFormatter.ofPattern("h:m 'on' dd-MMM-yyyy", Locale.US);
        String toStringDate = today.format(fmtOnDate);
        String toStringYear = today.format(fmtOnYear);
        String toStringMonth = today.format(fmtOnMonth);
        String toStringDay = currentDateTime.format(fmtOnDay);
        String toStringTimeZone = currentDateTime.format(localTimeZone);
        System.out.println(toStringDate);
        System.out.println(toStringYear);
        System.out.println(toStringMonth);
        System.out.println(toStringDay);
        System.out.println(toStringTimeZone);
    }
}
