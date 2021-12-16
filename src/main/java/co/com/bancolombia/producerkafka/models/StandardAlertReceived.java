package co.com.bancolombia.producerkafka.models;

public class StandardAlertReceived {
    private Integer clientID;
    private String clientName;
    private Integer documentNumber;
    private String documentType;
    private String customerSegment;
    private String commercialName;
    private String dateOfEvaluation;
    private String evaluationToDate;
    private String evaluationFromDate;
    private Agreement[] agreements;
    private CrossSellingProduct[] crossSellingProducts;

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getDateOfEvaluation() {
        return dateOfEvaluation;
    }

    public void setDateOfEvaluation(String dateOfEvaluation) {
        this.dateOfEvaluation = dateOfEvaluation;
    }

    public String getEvaluationToDate() {
        return evaluationToDate;
    }

    public void setEvaluationToDate(String evaluationToDate) {
        this.evaluationToDate = evaluationToDate;
    }

    public String getEvaluationFromDate() {
        return evaluationFromDate;
    }

    public void setEvaluationFromDate(String evaluationFromDate) {
        this.evaluationFromDate = evaluationFromDate;
    }

    public Agreement[] getAgreements() {
        return agreements;
    }

    public void setAgreements(Agreement[] agreements) {
        this.agreements = agreements;
    }

    public CrossSellingProduct[] getCrossSellingProducts() {
        return crossSellingProducts;
    }

    public void setCrossSellingProducts(CrossSellingProduct[] crossSellingProducts) {
        this.crossSellingProducts = crossSellingProducts;
    }
}
