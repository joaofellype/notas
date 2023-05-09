package com.teste.notas.infrasctruture.messaging.producers.notas;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j

@RequiredArgsConstructor
public class NotaProducerImpl implements NotaProducer{
    private final KafkaTemplate<String, String> kafkaTemplate;
    @Value("${topic.name.producer}")
    private String topicName;
    @Override
    public void send(String request) {

        log.info("Payload enviado: {}", request);
        kafkaTemplate.send(topicName, request);

    }
}
