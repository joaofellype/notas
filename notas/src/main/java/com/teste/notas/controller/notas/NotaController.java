package com.teste.notas.controller.notas;

import com.teste.notas.application.notas.dto.NotaDto;
import com.teste.notas.application.notas.request.NotaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface NotaController {

    @PostMapping("/nota")
     ResponseEntity<Void> save(@RequestBody NotaRequest notaRequest);
    @GetMapping("/nota")
    ResponseEntity<List<NotaDto>> find();
}
