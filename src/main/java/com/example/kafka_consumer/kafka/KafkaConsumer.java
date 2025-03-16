package com.example.kafka_consumer.kafka;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "newGroup")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received cat = " + record.value());
    }
}
