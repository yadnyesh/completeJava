package yb.yadnyesh.youtube.misc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToJavaLocalDate {

    public static void main(String[] args) {
        String str = "2016-03-04 11:30";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

        System.out.println("In time format: " + dateTime);
    }

}
