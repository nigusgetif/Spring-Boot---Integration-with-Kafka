package com.Spring_Kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "my_topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage( String message){
        kafkaTemplate.send(TOPIC,message);
        System.out.println(("message sent:" + message));

    }
}
