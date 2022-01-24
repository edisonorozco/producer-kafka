package co.com.bancolombia.producerkafka.models;

public class SegmentLevel {
    private String segmentName;
    private String value;
    private Compliance[] compliance;

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Compliance[] getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance[] compliance) {
        this.compliance = compliance;
    }
}