package com.angelozero.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angelozero.kafka.service.KafkaSender;

@RestController
@RequestMapping(value = "/cit-kafka/")
public class KafkaController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) throws InterruptedException {
		kafkaSender.send(message);

		return "Mensagem enviada com sucesso para Topic Kafka Test";
	}

}
