package co.com.bancolombia.producerkafka.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
    private String serviceName;
    private int numNonCompliance;
    @JsonProperty("NumOfTransaction")
    private NumOfTransaction numOfTransaction;
    @JsonProperty("AverageBalance")
    private AverageBalance averageBalance;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getNumNonCompliance() {
        return numNonCompliance;
    }

    public void setNumNonCompliance(int numNonCompliance) {
        this.numNonCompliance = numNonCompliance;
    }

    public NumOfTransaction getNumOfTransaction() {
        return numOfTransaction;
    }

    public void setNumOfTransaction(NumOfTransaction numOfTransaction) {
        this.numOfTransaction = numOfTransaction;
    }

    public AverageBalance getAverageBalance() {
        return averageBalance;
    }

    public void setAverageBalance(AverageBalance averageBalance) {
        this.averageBalance = averageBalance;
    }
}
