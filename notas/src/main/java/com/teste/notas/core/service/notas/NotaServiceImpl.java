package com.teste.notas.core.service.notas;

import com.teste.notas.core.domain.agreggates.notas.NotaAgreggate;
import com.teste.notas.core.domain.entity.notas.Nota;
import com.teste.notas.infrasctruture.persistence.notas.respository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    private NotaRepository notaRepository;

    public NotaServiceImpl(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @Override
    public void create(String name, String description, double value) {
        NotaAgreggate notaAgreggate = new NotaAgreggate();
        var nota = notaAgreggate.create(name,description,value);

        notaRepository.save(nota);
    }

    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }
}
