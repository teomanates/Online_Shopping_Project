package com.shopping.user_management_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    public void sendMessage(String topic, Object message) {
        kafkaTemplate.send(topic, message);
    }
}
