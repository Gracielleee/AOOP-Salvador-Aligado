package Model;
import java.time.LocalDate;

/**
 * @author Gracielle Salvador
 */

/**
 * Represents the history of tax rates, including minimum and maximum amounts, tax rates, fixed amounts, and effective dates.
 */
public class TaxRatesHistory {
    private Integer taxRateId;
    private Double minAmount;
    private Double maxAmount;
    private Double taxRate;
    private Double fixedAmount;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;

    // Default constructor
    public TaxRatesHistory() {
    }

    // Parameterized constructor
    public TaxRatesHistory(Double minAmount, Double maxAmount, Double taxRate,
                           Double fixedAmount, LocalDate effectiveStartDate, LocalDate effectiveEndDate) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.taxRate = taxRate;
        this.fixedAmount = fixedAmount;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
    }

    // Getters and Setters
    public Integer getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Integer taxRateId) {
        this.taxRateId = taxRateId;
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

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(Double fixedAmount) {
        this.fixedAmount = fixedAmount;
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
        return "TaxRatesHistory{" +
                "taxRateId=" + taxRateId +
                ", minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", taxRate=" + taxRate +
                ", fixedAmount=" + fixedAmount +
                ", effectiveStartDate=" + effectiveStartDate +
                ", effectiveEndDate=" + effectiveEndDate +
                '}';
    }
}
