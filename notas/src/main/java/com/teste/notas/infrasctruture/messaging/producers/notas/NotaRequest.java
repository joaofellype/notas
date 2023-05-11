package com.teste.notas.infrasctruture.messaging.producers.notas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NotaRequest {

    private  String name;
    private  String description;
    private  double value;
    private long createNote;

}
