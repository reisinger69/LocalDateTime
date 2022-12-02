package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilProTest {

    @org.junit.jupiter.api.Test
    void intToLocalDate() {
        int date = 12032006;
        LocalDate expected = LocalDate.of(2006, 03, 12);
        LocalDate actual = TimeUtilPro.intToLocalDate(date);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void intToLocalDateTestFalseValue() {
        int date = 120;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.intToLocalDate(date);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void intToLocalDateTestMinusValue() {
        int date = -12032006;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.intToLocalDate(date);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void longToLocalDate() {
        long date = 120320061432L;
        LocalDate expected = LocalDate.of(2006, 03, 12);
        LocalDate actual = TimeUtilPro.longToLocalDate(date);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void longToLocalDateFalseValue() {
        long date = 1201432L;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.longToLocalDate(date);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void longToLocalDateMinusValue() {
        long date = -120320061432L;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.longToLocalDate(date);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void dateToLocalDate() {
        Date d1 = new Date(2004-1900, 9-1, 14);
        LocalDate expected = LocalDate.of(2004, 9, 14);
        LocalDate actual = TimeUtilPro.dateToLocalDate(d1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void dateToLocalDateWithNull() {
        Date d1 = null;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.dateToLocalDate(d1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calendarToLocalDate() {
        Calendar d1 = Calendar.getInstance();
        d1.set(2004, 9, 14);
        LocalDate expected = LocalDate.of(2004, 9, 14);
        LocalDate actual = TimeUtilPro.calendarToLocalDate(d1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calendarToLocalDateWithNull() {
        Calendar d1 = null;
        LocalDate expected = null;
        LocalDate actual = TimeUtilPro.calendarToLocalDate(d1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void intToLocalDateTime() {
    }

    @org.junit.jupiter.api.Test
    void longToLocalDateTime() {
    }

    @org.junit.jupiter.api.Test
    void dateToLocalDateTime() {
    }

    @org.junit.jupiter.api.Test
    void calendarToLocalDateTime() {
    }

    @org.junit.jupiter.api.Test
    void localDateToInt() {
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToInt() {
    }

    @org.junit.jupiter.api.Test
    void localDateToLong() {
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToLong() {
    }

    @org.junit.jupiter.api.Test
    void localDateToDate() {
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToDate() {
    }

    @org.junit.jupiter.api.Test
    void localDateToCalendar() {
    }

    @org.junit.jupiter.api.Test
    void localDateTimeToCalendar() {
    }
}