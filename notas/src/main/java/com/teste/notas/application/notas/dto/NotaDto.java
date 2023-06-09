package com.teste.notas.application.notas.dto;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaDto {
    private  String name;
    private  String description;
    private  double value;
    private String createNote;
    private String closeNote;

}
