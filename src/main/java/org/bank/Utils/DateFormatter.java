package org.bank.Utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate toLocalDate(String date) {
        return LocalDate.parse(date, FORMATTER);
    }

    public static Date toDate(String date) {
        if (date == null) {
            return null;
        }

        LocalDate localDate = DateFormatter.toLocalDate(date);

        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
