package com.kafka.consumer.example.consumer;

import com.kafka.consumer.example.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

//    @KafkaListener(topics = "test-topic",groupId = "test-consumer-group")
//    public void consumeEvents(Customer customer) {
//        log.info("consumer consume the events {} ", customer.toString());
//    }

    // demo purpose we can create multiple consumer instances to consume messages from different partitions

    @KafkaListener(topics = "test-topic",groupId = "test-consumer-group")
    public void consume1(String message) {
        log.info("consumer1 consume the message {} ", message);
    }

    @KafkaListener(topics = "test-topic",groupId = "test-consumer-group")
    public void consume2(String message) {
        log.info("consumer2 consume the message {} ", message);
    }

    @KafkaListener(topics = "test-topic",groupId = "test-consumer-group")
    public void consume3(String message) {
        log.info("consumer3 consume the message {} ", message);
    }

    @KafkaListener(topics = "test-topic",groupId = "test-consumer-group")
    public void consume4(String message) {
        log.info("consumer4 consume the message {} ", message);
    }
}
