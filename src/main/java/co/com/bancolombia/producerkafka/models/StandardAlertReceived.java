package co.com.bancolombia.producerkafka.models;

public class StandardAlertReceived {
    private Integer documentNumber;
    private int documentType;
    private Integer mdmKey;
    private String clientName;
    private String commercialName;
    private String zoneManagerName;
    private String segment;
    private Service[] services;
    private CrossSellingProduct[] crossSellingProducts;

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public Integer getMdmKey() {
        return mdmKey;
    }

    public void setMdmKey(Integer mdmKey) {
        this.mdmKey = mdmKey;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getZoneManagerName() {
        return zoneManagerName;
    }

    public void setZoneManagerName(String zoneManagerName) {
        this.zoneManagerName = zoneManagerName;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public CrossSellingProduct[] getCrossSellingProducts() {
        return crossSellingProducts;
    }

    public void setCrossSellingProducts(CrossSellingProduct[] crossSellingProducts) {
        this.crossSellingProducts = crossSellingProducts;
    }
}
