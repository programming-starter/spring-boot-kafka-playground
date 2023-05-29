package me.parker.springbootkafkaplayground.controller;

import lombok.RequiredArgsConstructor;
import me.parker.springbootkafkaplayground.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("messages")
public class MessageController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public void sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage("my-topic", message);
    }
}
