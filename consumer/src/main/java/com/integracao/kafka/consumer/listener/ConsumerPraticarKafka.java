package com.integracao.kafka.consumer.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//Essa classe é para consumir o topico(praticar-kafka) que foi criado no Producer
@Service
public class ConsumerPraticarKafka {

    private final Logger logger = LoggerFactory.getLogger(ConsumerPraticarKafka.class);

    @KafkaListener(topics = "${topic.praticar-kafka}", groupId = "group_id")
    public void consume(String message) {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
