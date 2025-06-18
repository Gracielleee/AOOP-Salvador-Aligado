package Model;
import java.time.LocalDate;

/**
 * @author Gracielle Salvador
 */


/**
 * Represents the history of PhilHealth rates, including minimum and maximum amounts, premium rates, and effective dates.
 */
public class PhilhealthRatesHistory {
    private Integer philhealthRateId;
    private Double minAmount;
    private Double maxAmount;
    private Double premiumRate;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;

    // Default constructor
    public PhilhealthRatesHistory() {
    }

    // Parameterized constructor
    public PhilhealthRatesHistory(Double minAmount, Double maxAmount, Double premiumRate,
                                  LocalDate effectiveStartDate, LocalDate effectiveEndDate) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.premiumRate = premiumRate;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
    }

    // Getters and Setters
    public Integer getPhilhealthRateId() {
        return philhealthRateId;
    }

    public void setPhilhealthRateId(Integer philhealthRateId) {
        this.philhealthRateId = philhealthRateId;
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

    public Double getPremiumRate() {
        return premiumRate;
    }

    public void setPremiumRate(Double premiumRate) {
        this.premiumRate = premiumRate;
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
        return "PhilhealthRatesHistory{" +
                "philhealthRateId=" + philhealthRateId +
                ", minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", premiumRate=" + premiumRate +
                ", effectiveStartDate=" + effectiveStartDate +
                ", effectiveEndDate=" + effectiveEndDate +
                '}';
    }
}
