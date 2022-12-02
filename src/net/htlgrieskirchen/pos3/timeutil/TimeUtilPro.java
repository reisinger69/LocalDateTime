package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date) {
        if (date < 0) {
            return null;
        }

        String dateString = String.valueOf(date);

        if (dateString.length() != 8) {
            return null;
        }
        return LocalDate.of(Integer.parseInt(dateString.substring(4,8)), Integer.parseInt(dateString.substring(2,4)) ,Integer.parseInt(dateString.substring(0, 2)));
    }

    public static LocalDate longToLocalDate(long dateTime) {
        if (dateTime < 0) {
            return null;
        }

        String dateString = String.valueOf(dateTime);

        if (dateString.length() != 12) {
            return null;
        }
        return LocalDate.of(Integer.parseInt(dateString.substring(4,8)), Integer.parseInt(dateString.substring(2,4)) ,Integer.parseInt(dateString.substring(0, 2)));

    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.toInstant().atZone(ZoneId.of("Europe/Vienna")).toLocalDate();
    }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        return dateTime.toInstant().atZone(ZoneId.of("Europe/Vienna")).toLocalDate();
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        return null;
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        return null;
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        return null;
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        return null;
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        return -1;
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        return -1;
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        return -1L;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        return -1L;
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return null;
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        return null;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return null;
    }

}
