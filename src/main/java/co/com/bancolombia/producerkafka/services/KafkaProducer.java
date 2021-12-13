package co.com.bancolombia.producerkafka.services;

import co.com.bancolombia.producerkafka.models.StandardAlertReceived;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;

public class KafkaProducer {

    private final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    private final ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate;

    public KafkaProducer(ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate) {
        this.reactiveKafkaProducerTemplate = reactiveKafkaProducerTemplate;
    }

    public void send(String topic, String standardAlert) {
        log.info("send to topic={}, {}={},", topic, StandardAlertReceived.class.getSimpleName(), standardAlert);
        reactiveKafkaProducerTemplate.send(topic, standardAlert)
                .doOnSuccess(senderResult -> {
                    System.out.println("successfully sent: " + standardAlert
                    );
                })
                .subscribe();
    }

}
