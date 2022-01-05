package com.redeyefrog.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWorldListener {

    @KafkaListener(topics = {"${topic.hello.world}"}, groupId = "hello")
    public void process(String message) {
        log.info("Receive Message: {}", message);
    }

}
