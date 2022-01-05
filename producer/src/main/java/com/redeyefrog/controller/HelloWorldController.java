package com.redeyefrog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@Slf4j
@RestController
public class HelloWorldController {

    @Value("${topic.hello.world}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(String name) {
        log.info("name: {}", name);

        kafkaTemplate.send(topic, MessageFormat.format("Hello {0}", name));

        return "{\"return_desc\" : \"success\"}";
    }

}
