package com.teste.notas.controller.notas;

import com.teste.notas.application.notas.dto.NotaDto;
import com.teste.notas.application.notas.request.NotaRequest;
import com.teste.notas.controller.shared.BaseControllerImpl;
import com.teste.notas.core.domain.agreggates.notas.Nota;
import com.teste.notas.core.domain.shared.converters.DateTimeToString;
import com.teste.notas.core.service.notas.NotaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotaControllerImpl extends BaseControllerImpl<NotaDto> implements NotaController{

    private NotaService notaService;

    public NotaControllerImpl(NotaService notaService) {
        this.notaService = notaService;
    }

    @Override
    public ResponseEntity<Void> save(NotaRequest notaRequest) {

        notaService.create(notaRequest.getName(), notaRequest.getDescription(),notaRequest.getValue());
        return created();
    }

    @Override
    public ResponseEntity<List<NotaDto>>find() {

        var notas = notaService.findAll().stream().map(nota -> new NotaDto(nota.getName(),nota.getDescription(),nota.getValue(), DateTimeToString.toString(nota.getCreateNote()),DateTimeToString.toString(nota.getCloseNote()))).toList();
        return ok(notas);
    }
}
