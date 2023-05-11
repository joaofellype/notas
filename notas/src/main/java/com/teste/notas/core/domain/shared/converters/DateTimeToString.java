package com.teste.notas.core.domain.shared.converters;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeToString {


    public static String toString(LocalDateTime dateTime){

        if(dateTime !=null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            return dateTime.format(formatter);
        }else{
            return "";
        }
    }
}
