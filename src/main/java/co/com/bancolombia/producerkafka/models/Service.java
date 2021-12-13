package co.com.bancolombia.producerkafka.models;

public class Service {
    private int numberDefaults;
    private String serviceName;
    private String agreement;
    private String tradingStartDate;
    private String monitoringStartDate;
    private String monitoringEndDate;
    private Integer agreedFeeTransaction;
    private Integer agreedTransitions;
    private int[] transitions;
    private double agreedBalance;
    private double[] balances;
    private double newRate;
    private String applicationDate;
    private String reason;

    public int getNumberDefaults() {
        return numberDefaults;
    }

    public void setNumberDefaults(int numberDefaults) {
        this.numberDefaults = numberDefaults;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getTradingStartDate() {
        return tradingStartDate;
    }

    public void setTradingStartDate(String tradingStartDate) {
        this.tradingStartDate = tradingStartDate;
    }

    public String getMonitoringStartDate() {
        return monitoringStartDate;
    }

    public void setMonitoringStartDate(String monitoringStartDate) {
        this.monitoringStartDate = monitoringStartDate;
    }

    public String getMonitoringEndDate() {
        return monitoringEndDate;
    }

    public void setMonitoringEndDate(String monitoringEndDate) {
        this.monitoringEndDate = monitoringEndDate;
    }

    public Integer getAgreedFeeTransaction() {
        return agreedFeeTransaction;
    }

    public void setAgreedFeeTransaction(Integer agreedFeeTransaction) {
        this.agreedFeeTransaction = agreedFeeTransaction;
    }

    public Integer getAgreedTransitions() {
        return agreedTransitions;
    }

    public void setAgreedTransitions(Integer agreedTransitions) {
        this.agreedTransitions = agreedTransitions;
    }

    public int[] getTransitions() {
        return transitions;
    }

    public void setTransitions(int[] transitions) {
        this.transitions = transitions;
    }

    public double getAgreedBalance() {
        return agreedBalance;
    }

    public void setAgreedBalance(double agreedBalance) {
        this.agreedBalance = agreedBalance;
    }

    public double[] getBalances() {
        return balances;
    }

    public void setBalances(double[] balances) {
        this.balances = balances;
    }

    public double getNewRate() {
        return newRate;
    }

    public void setNewRate(double newRate) {
        this.newRate = newRate;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
