package Model;

/**
 * @author Gracielle Salvador
 */

/**
 * Represents the tax and deduction details associated with a payslip.
 */
public class TaxAndDeduction {
    private Integer taxAndDeductionId;
    private Integer payslipId;
    private Integer sssRateId;
    private Integer philhealthRateId;
    private Integer pagibigRateId;
    private Double totalDeductions;
    private Integer taxRateId;

    // Default constructor
    public TaxAndDeduction() {
    }

    // Parameterized constructor
    public TaxAndDeduction(Integer payslipId, Integer sssRateId, Integer philhealthRateId,
                           Integer pagibigRateId, Double totalDeductions, Integer taxRateId) {
        this.payslipId = payslipId;
        this.sssRateId = sssRateId;
        this.philhealthRateId = philhealthRateId;
        this.pagibigRateId = pagibigRateId;
        this.totalDeductions = totalDeductions;
        this.taxRateId = taxRateId;
    }

    // Getters and Setters
    public Integer getTaxAndDeductionId() {
        return taxAndDeductionId;
    }

    public void setTaxAndDeductionId(Integer taxAndDeductionId) {
        this.taxAndDeductionId = taxAndDeductionId;
    }

    public Integer getPayslipId() {
        return payslipId;
    }

    public void setPayslipId(Integer payslipId) {
        this.payslipId = payslipId;
    }

    public Integer getSssRateId() {
        return sssRateId;
    }

    public void setSssRateId(Integer sssRateId) {
        this.sssRateId = sssRateId;
    }

    public Integer getPhilhealthRateId() {
        return philhealthRateId;
    }

    public void setPhilhealthRateId(Integer philhealthRateId) {
        this.philhealthRateId = philhealthRateId;
    }

    public Integer getPagibigRateId() {
        return pagibigRateId;
    }

    public void setPagibigRateId(Integer pagibigRateId) {
        this.pagibigRateId = pagibigRateId;
    }

    public Double getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(Double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public Integer getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    @Override
    public String toString() {
        return "TaxAndDeduction{" +
                "taxAndDeductionId=" + taxAndDeductionId +
                ", payslipId=" + payslipId +
                ", sssRateId=" + sssRateId +
                ", philhealthRateId=" + philhealthRateId +
                ", pagibigRateId=" + pagibigRateId +
                ", totalDeductions=" + totalDeductions +
                ", taxRateId=" + taxRateId +
                '}';
    }
}
