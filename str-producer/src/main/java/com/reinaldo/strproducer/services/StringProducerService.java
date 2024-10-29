package com.reinaldo.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Send message -> -> -> ");
        kafkaTemplate.send("str-topic", message);
//                .addCallback(
//                success -> {
//                    log.info("Send message with success {}", message);
//                    log.info("Partition {}", success.getRecordMetadata().partition());
//                    log.info("Offset {}", success.getRecordMetadata().offset());
//                },
//                error -> log.error("Error send message")
//        );
    }
}
