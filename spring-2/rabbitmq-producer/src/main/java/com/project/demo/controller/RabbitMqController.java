package com.project.demo.controller;



import com.project.demo.model.Item;
import com.project.demo.service.RabbitMQService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
    @Autowired
    RabbitMQService rabbitMqService;
     
    @GetMapping("/")
    public String redirectRespone()
    {
    	return "producer working";
    }
    @PostMapping("/items")
    public ResponseEntity<String> postMessage(@RequestBody Item item){
        rabbitMqService.sendMessage(item);
        return new ResponseEntity<String>("Item pushed to RabbitMQ",HttpStatus.CREATED);
    }
}
