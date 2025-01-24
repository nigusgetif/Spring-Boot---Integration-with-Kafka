package com.Spring_Kafka.demo.controller;

import com.Spring_Kafka.demo.service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService){
        this.kafkaProducerService = kafkaProducerService;
    }
    @GetMapping("/send")
    public String sendMessage(@RequestParam String message){
        kafkaProducerService.sendMessage(message);
        return "message sent sucessfully";

    }

}
