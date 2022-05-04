package com.kafka.example.controller;

import com.kafka.example.dto.KafkaRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class CRUDController {

    @GetMapping("/getLastMessage")
    public String getLastMessage() {
        return "getLastMessage";
    }

    @PostMapping("/putMessage")
    public void putMessage(@RequestBody KafkaRequestDto kafkaRequestDto) {
        System.out.println("Input Request : "+kafkaRequestDto);
    }
}
