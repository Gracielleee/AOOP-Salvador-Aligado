package Model;
import java.time.LocalDate;

/**
 * @author Gracielle Salvador
 */

/**
 * Represents the history of SSS rates, including minimum and maximum amounts, contributions, and effective dates.
 */
public class SssRatesHistory {
    private Integer sssRateId;
    private Double minAmount;
    private Double maxAmount;
    private Double contribution;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;

    // Default constructor
    public SssRatesHistory() {
    }

    // Parameterized constructor
    public SssRatesHistory(Double minAmount, Double maxAmount, Double contribution,
                           LocalDate effectiveStartDate, LocalDate effectiveEndDate) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.contribution = contribution;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
    }

    // Getters and Setters
    public Integer getSssRateId() {
        return sssRateId;
    }

    public void setSssRateId(Integer sssRateId) {
        this.sssRateId = sssRateId;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public LocalDate getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(LocalDate effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public LocalDate getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(LocalDate effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    @Override
    public String toString() {
        return "SssRatesHistory{" +
                "sssRateId=" + sssRateId +
                ", minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", contribution=" + contribution +
                ", effectiveStartDate=" + effectiveStartDate +
                ", effectiveEndDate=" + effectiveEndDate +
                '}';
    }
}
