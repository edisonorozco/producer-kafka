package co.com.bancolombia.producerkafka.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AverageBalance {
    private double value;
    private Compliance[] compliance;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Compliance[] getCompliances() {
        return compliance;
    }

    public void setCompliances(Compliance[] compliances) {
        this.compliance = compliances;
    }
}
