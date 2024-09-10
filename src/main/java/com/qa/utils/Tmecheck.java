package com.qa.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tmecheck {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextMonth = now.plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM / yyyy");
        String formattedDate1 = formatter.format(nextMonth);
        System.out.println(formattedDate1);
    }
    }
