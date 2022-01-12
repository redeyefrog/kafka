package com.redeyefrog.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWorldListener {

    @KafkaListener(topics = {"${topic.hello.world}"}, groupId = "hello")
    public void process(@Payload String message,
                        @Header(name = KafkaHeaders.RECEIVED_MESSAGE_KEY, required = false) Integer key,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                        @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long ts) {
        log.info("Receive Payload: {}, MESSAGE KEY: {}, PARTITION ID: {}, TOPIC: {}, TIMESTAMP: {}", message, key, partition, topic, ts);
    }

}
