package com.teste.notas.core.domain.entity.notas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class Nota {

    @Column
    @Id
    private  String id;
    @Column
    private  String name;
    @Column
    private  String description;
    @Column
    private LocalDateTime createNote;
    @Column
    private LocalDateTime closeNote;
    @Column
    private  double value;


    public Nota(String name, String description, double value){

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.value = value;
        this.createNote = LocalDateTime.now();
    }

    public Nota() {
    }
}
