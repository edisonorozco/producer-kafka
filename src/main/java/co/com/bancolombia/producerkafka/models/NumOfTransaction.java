package co.com.bancolombia.producerkafka.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumOfTransaction {
    private double value;
    @JsonProperty("compliance")
    private Compliance[] compliances;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Compliance[] getCompliances() {
        return compliances;
    }

    public void setCompliances(Compliance[] compliances) {
        this.compliances = compliances;
    }
}
