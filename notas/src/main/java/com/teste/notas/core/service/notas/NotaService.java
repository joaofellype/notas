package com.teste.notas.core.service.notas;

import com.teste.notas.core.domain.agreggates.notas.Nota;

import java.util.List;

public interface NotaService {


    void create(String name, String description,double value);

    List<Nota> findAll();

}
