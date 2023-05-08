package com.teste.notas.controller.notas;

import com.teste.notas.application.notas.dto.NotaDto;
import com.teste.notas.core.service.notas.NotaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotaControllerImpl implements NotaController{

    private NotaService notaService;

    public NotaControllerImpl(NotaService notaService) {
        this.notaService = notaService;
    }

    @Override
    public ResponseEntity<Void> save(NotaDto notaDto) {

        notaService.create(notaDto.getName(), notaDto.getDescription(),notaDto.getValue());
        return ResponseEntity.ok().build();
    }
}
