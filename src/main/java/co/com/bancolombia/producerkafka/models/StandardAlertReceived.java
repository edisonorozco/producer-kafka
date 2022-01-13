package co.com.bancolombia.producerkafka.models;

public class StandardAlertReceived {

    private String dealId;
    private String dealStatus;
    private String dealCompliantStatus;
    private String customerid;
    private String customerName;
    private String documentNumber;
    private String documentType;
    private String customerSegment;
    private String dateOfEvaluation;
    private String evalutionFromDate;
    private String evalutionToDate;
    private String evaluationFrequency;
    private CommitmentDetails commitmentDetails;

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getDealCompliantStatus() {
        return dealCompliantStatus;
    }

    public void setDealCompliantStatus(String dealCompliantStatus) {
        this.dealCompliantStatus = dealCompliantStatus;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
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

    public String getDateOfEvaluation() {
        return dateOfEvaluation;
    }

    public void setDateOfEvaluation(String dateOfEvaluation) {
        this.dateOfEvaluation = dateOfEvaluation;
    }

    public String getEvalutionFromDate() {
        return evalutionFromDate;
    }

    public void setEvalutionFromDate(String evalutionFromDate) {
        this.evalutionFromDate = evalutionFromDate;
    }

    public String getEvalutionToDate() {
        return evalutionToDate;
    }

    public void setEvalutionToDate(String evalutionToDate) {
        this.evalutionToDate = evalutionToDate;
    }

    public String getEvaluationFrequency() {
        return evaluationFrequency;
    }

    public void setEvaluationFrequency(String evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
    }

    public CommitmentDetails getCommitmentDetails() {
        return commitmentDetails;
    }

    public void setCommitmentDetails(CommitmentDetails commitmentDetails) {
        this.commitmentDetails = commitmentDetails;
    }
}
