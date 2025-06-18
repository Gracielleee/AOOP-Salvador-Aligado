package Model;

/**
 * @author Gracielle Salvador
 */

import java.time.LocalDate;

/**
 * Represents the history of Pag-IBIG rates, including minimum and maximum amounts, employee and employer rates, total contributions, and effective dates.
 */
public class PagibigRatesHistory {
    private Integer pagibigRateId;
    private Double minAmount;
    private Double maxAmount;
    private Double employeeRate;
    private Double employerRate;
    private Double totalContribution;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;

    // Default constructor
    public PagibigRatesHistory() {
    }

    // Parameterized constructor
    public PagibigRatesHistory(Double minAmount, Double maxAmount, Double employeeRate,
                               Double employerRate, Double totalContribution,
                               LocalDate effectiveStartDate, LocalDate effectiveEndDate) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.employeeRate = employeeRate;
        this.employerRate = employerRate;
        this.totalContribution = totalContribution;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
    }

    // Getters and Setters
    public Integer getPagibigRateId() {
        return pagibigRateId;
    }

    public void setPagibigRateId(Integer pagibigRateId) {
        this.pagibigRateId = pagibigRateId;
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

    public Double getEmployeeRate() {
        return employeeRate;
    }

    public void setEmployeeRate(Double employeeRate) {
        this.employeeRate = employeeRate;
    }

    public Double getEmployerRate() {
        return employerRate;
    }

    public void setEmployerRate(Double employerRate) {
        this.employerRate = employerRate;
    }

    public Double getTotalContribution() {
        return totalContribution;
    }

    public void setTotalContribution(Double totalContribution) {
        this.totalContribution = totalContribution;
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
        return "PagibigRatesHistory{" +
                "pagibigRateId=" + pagibigRateId +
                ", minAmount=" + minAmount +
                ", maxAmount=" + maxAmount +
                ", employeeRate=" + employeeRate +
                ", employerRate=" + employerRate +
                ", totalContribution=" + totalContribution +
                ", effectiveStartDate=" + effectiveStartDate +
                ", effectiveEndDate=" + effectiveEndDate +
                '}';
    }
}
