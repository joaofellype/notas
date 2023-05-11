package com.teste.notas.application.notas.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaRequest {
    private  String name;
    private  String description;
    private  double value;

}
