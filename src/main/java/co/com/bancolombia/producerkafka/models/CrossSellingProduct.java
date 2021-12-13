package co.com.bancolombia.producerkafka.models;

public class CrossSellingProduct {
    private String productName;
    private boolean tenure;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }
}
