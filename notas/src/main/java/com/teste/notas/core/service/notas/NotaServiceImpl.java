package com.teste.notas.core.service.notas;

import com.teste.notas.core.domain.agreggates.notas.NotaAgreggate;
import com.teste.notas.core.domain.entity.notas.Nota;
import com.teste.notas.core.domain.shared.helpers.ObjectMapperJson;
import com.teste.notas.infrasctruture.messaging.producers.notas.NotaProducer;
import com.teste.notas.infrasctruture.persistence.notas.respository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    private NotaRepository notaRepository;
    private NotaProducer notaProducer;
    public NotaServiceImpl(NotaRepository notaRepository,NotaProducer notaProducer) {
        this.notaRepository = notaRepository;
        this.notaProducer = notaProducer;
    }

    @Override
    public void create(String name, String description, double value) {
        NotaAgreggate notaAgreggate = new NotaAgreggate();
        var nota = notaAgreggate.create(name,description,value);

        notaRepository.save(nota);
        sendMessage(nota);

    }
    private void sendMessage(Nota nota){
        nota.setCreateNote(null);


        String json = ObjectMapperJson.toStringJson(nota);
        notaProducer.send(json);
    }
    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }
}
