package com.angelozero.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static final String KAFKA_TOPIC = "topic_kafka_test";

	public void send(String message) throws InterruptedException {
		int x = 0;
		while (x < 3) {
			Thread.sleep(1500);
			kafkaTemplate.send(KAFKA_TOPIC, message + " " + (int) (Math.random() * 100));
			Thread.sleep(1500);
			x++;
		}
	}

	@KafkaListener(topics = KAFKA_TOPIC, groupId = "foo")
	public void listen(String message) {
		System.out.println("\nRecebendo mensagem: " + message);
	}

}
