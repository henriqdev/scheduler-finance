package com.global.scheduler_finance.common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Helpers {
    public static LocalDate convertStringToLocalDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida: " + e.getMessage());
            return null;
        }
    }

    public static LocalDate getCurrentLocalDate() {
        return LocalDate.now();
    }
}
