package co.com.bancolombia.producerkafka.serializer;

import co.com.bancolombia.producerkafka.models.StandardAlertReceived;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class CustomSerializer implements Serializer<StandardAlertReceived> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String topic, StandardAlertReceived data) {
        try {
            if (data == null){
                return null;
            }
            return objectMapper.writeValueAsBytes(data);
        } catch (Exception e) {
            throw new SerializationException("Error when serializing StandardAlertReceived to byte[]");
        }
    }

    @Override
    public void close() {
    }
}
