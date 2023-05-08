package com.teste.notas.core.service.notas;

import com.teste.notas.core.domain.entity.notas.Nota;
import jakarta.persistence.Column;

import java.time.LocalDateTime;
import java.util.List;

public interface NotaService {


    void create(String name, String description,double value);

    List<Nota> findAll();

}
