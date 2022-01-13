package co.com.bancolombia.producerkafka.models;

public class Agreement {
    private String agreementId;
    private Service[] services;

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }
}

