package com.teste.notas.infrasctruture.messaging.producers.notas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NotaRequestFactory {


    public static NotaRequest create(String name,
                                     String description,
                                     double value,
                                     LocalDateTime createNota){


        ZonedDateTime zdt = ZonedDateTime.of(createNota, ZoneId.systemDefault());
        long date = zdt.toInstant().toEpochMilli();

        return new NotaRequest(name,description,value,date);

    }
}
