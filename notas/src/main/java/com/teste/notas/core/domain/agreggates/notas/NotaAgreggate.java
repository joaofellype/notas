package com.teste.notas.core.domain.agreggates.notas;

import com.teste.notas.core.domain.entity.notas.Nota;

import java.time.LocalDateTime;

public class NotaAgreggate {

    private Nota nota;


    public  Nota create(String name, String description, double value){

        this.nota = new Nota(name,description,value);


        return nota;
    }

    public static boolean validateDateCloseNote(Nota nota,LocalDateTime dateClose){

        return !nota.getCreateNote().isEqual(dateClose);
    }

}
