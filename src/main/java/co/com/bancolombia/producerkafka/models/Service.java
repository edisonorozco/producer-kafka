package co.com.bancolombia.producerkafka.models;

import java.math.BigDecimal;

public class Service {
    private String serviceName;
    private int numberDefaults;
    private Integer agreedTransitions;
    private Compliance[] complianceTransitions;
    private BigDecimal averageBalance;
    private Compliance[] complianceAverageBalance;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getNumberDefaults() {
        return numberDefaults;
    }

    public void setNumberDefaults(int numberDefaults) {
        this.numberDefaults = numberDefaults;
    }

    public Integer getAgreedTransitions() {
        return agreedTransitions;
    }

    public void setAgreedTransitions(Integer agreedTransitions) {
        this.agreedTransitions = agreedTransitions;
    }

    public Compliance[] getComplianceTransitions() {
        return complianceTransitions;
    }

    public void setComplianceTransitions(Compliance[] complianceTransitions) {
        this.complianceTransitions = complianceTransitions;
    }

    public BigDecimal getAverageBalance() {
        return averageBalance;
    }

    public void setAverageBalance(BigDecimal averageBalance) {
        this.averageBalance = averageBalance;
    }

    public Compliance[] getComplianceAverageBalance() {
        return complianceAverageBalance;
    }

    public void setComplianceAverageBalance(Compliance[] complianceAverageBalance) {
        this.complianceAverageBalance = complianceAverageBalance;
    }
}
