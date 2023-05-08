package com.teste.notas.controller.notas;

import com.teste.notas.application.notas.dto.NotaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface NotaController {

    @PostMapping("/nota")
    public ResponseEntity<Void> save(@RequestBody NotaDto notaDto);
}
