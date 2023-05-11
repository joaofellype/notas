package com.teste.notas.core.service.notas;

import com.teste.notas.core.domain.agreggates.notas.Nota;
import com.teste.notas.core.domain.shared.helpers.ObjectMapperJson;
import com.teste.notas.infrasctruture.messaging.producers.notas.NotaProducer;
import com.teste.notas.infrasctruture.messaging.producers.notas.NotaRequestFactory;
import com.teste.notas.infrasctruture.persistence.notas.respository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;
    private final NotaProducer notaProducer;
    public NotaServiceImpl(NotaRepository notaRepository,NotaProducer notaProducer) {
        this.notaRepository = notaRepository;
        this.notaProducer = notaProducer;
    }

    @Override
    public void create(String name, String description, double value) {

        var nota = Nota.create(name,description,value);

        var notaCreate = notaRepository.save(nota);
        sendMessage(notaCreate);

    }
    private void sendMessage(Nota nota){

        var notaRequest = NotaRequestFactory.create(nota.getName(),nota.getDescription(),nota.getValue(),nota.getCreateNote());


        String json = ObjectMapperJson.toStringJson(notaRequest);
        notaProducer.send(json);
    }
    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }
}
