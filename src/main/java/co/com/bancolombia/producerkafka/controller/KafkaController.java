package co.com.bancolombia.producerkafka.controller;

import co.com.bancolombia.producerkafka.services.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class KafkaController {

    @Autowired
    ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate;

    @Value(value = "${KAFKA_XELERATE_TOPIC}")
    private String kafkaTopic;

    @GetMapping("/send")
    public String startSendMessage() throws InterruptedException {

        String json = "{\"documentNumber\":10455621,\"documentType\":1,\"mdmKey\":10458,\"clientName\":\"Flores S.A.S\",\"commercialName\":\"Commercial 1\",\"zoneManagerName\":\"Zone manager 1\",\"segment\":\"Pyme\",\"services\":[{\"numberDefaults\":2,\"serviceName\":\"Recaudo PSE\",\"agreement\":\"122\",\"tradingStartDate\":\"19/10/2021\",\"monitoringStartDate\":\"19/10/2021\",\"monitoringEndDate\":\"31/10/2021\",\"agreedFeeTransaction\":800,\"agreedTransitions\":100,\"transitions\":[100,30,10],\"agreedBalance\":1000000.0,\"balances\":[45024.0,45414.0,45411.0],\"newRate\":4545.0,\"applicationDate\":\"19/10/2021\",\"reason\":\"xxxxxx\"},{\"numberDefaults\":2,\"serviceName\":\"Recaudo Electronico\",\"agreement\":\"123\",\"tradingStartDate\":\"31/10/2021\",\"monitoringStartDate\":\"30/11/2021\",\"monitoringEndDate\":\"30/11/2021\",\"agreedFeeTransaction\":800,\"agreedTransitions\":100,\"transitions\":[100,30,10],\"agreedBalance\":1000000.0,\"balances\":[45024.0,45414.0,45411.0],\"newRate\":4545.0,\"applicationDate\":\"19/10/2021\",\"reason\":\"xxxxxx\"}],\"crossSellingProducts\":[{\"productName\":\"Factoring\",\"tenure\":true},{\"productName\":\"Cartera\",\"tenure\":true}]}";

        KafkaProducer kafkaProducer = new KafkaProducer(reactiveKafkaProducerTemplate);

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(1000L);
            kafkaProducer.send(kafkaTopic, json);
        }

        return "Se inicio envio de mensajes";
    }

}
