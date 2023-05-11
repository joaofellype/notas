package com.teste.notas.core.domain.agreggates.notas;

import com.teste.notas.core.domain.shared.validators.CustomValidator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    @NotEmpty(message = "Name is not empty")
    private  String name;
    @Column
    @NotNull
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

    public static Nota create(String name, String description, double value){

        var nota = new Nota(name,description,value);

        CustomValidator.validateAndThrow(nota);
        return nota;
    }

    public Nota() {
    }
}
