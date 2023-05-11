package com.teste.notas.infrasctruture.mapper.notas;

import com.teste.notas.application.notas.dto.NotaDto;
import com.teste.notas.core.domain.agreggates.notas.Nota;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotaMapper {

    NotaMapper MAPPER = Mappers.getMapper(NotaMapper.class);

    Nota mapToNota(NotaDto notaDto);

}
