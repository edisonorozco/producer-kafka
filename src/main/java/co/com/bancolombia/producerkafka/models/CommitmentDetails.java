package co.com.bancolombia.producerkafka.models;

public class CommitmentDetails {
    private SegmentLevel[] segmentLevel;
    private Agreement[] agreements;

    public SegmentLevel[] getSegmentLevel() {
        return segmentLevel;
    }

    public void setSegmentLevel(SegmentLevel[] segmentLevel) {
        this.segmentLevel = segmentLevel;
    }

    public Agreement[] getAgreements() {
        return agreements;
    }

    public void setAgreements(Agreement[] agreements) {
        this.agreements = agreements;
    }
}
