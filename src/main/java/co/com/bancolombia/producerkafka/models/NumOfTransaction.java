package co.com.bancolombia.producerkafka.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumOfTransaction {
    private double value;
    private Compliance[] compliance;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Compliance[] getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance[] compliance) {
        this.compliance = compliance;
    }
}
