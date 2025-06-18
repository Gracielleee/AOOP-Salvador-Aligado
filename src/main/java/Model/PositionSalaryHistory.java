package Model;
import java.time.LocalDate;

/**
 * @author Gracielle Salvador
 */


/**
 * Represents the salary history of a position held by an employee, including various allowances and effective dates.
 */
public class PositionSalaryHistory {
    private Integer positionSalaryHistoryId;
    private Integer empId;
    private Integer positionId;
    private Double basicSalary;
    private Double hourlyRate;
    private Double grossSemiMonthlyRate;
    private Double riceSubsidy;
    private Double phoneAllowance;
    private Double clothingAllowance;
    private LocalDate effectiveStartDate;
    private LocalDate effectiveEndDate;

    // Default constructor
    public PositionSalaryHistory() {
    }

    // Parameterized constructor
    public PositionSalaryHistory(Integer empId, Integer positionId, Double basicSalary,
                                 Double riceSubsidy, Double phoneAllowance, Double clothingAllowance,
                                 LocalDate effectiveStartDate, LocalDate effectiveEndDate) {
        this.empId = empId;
        this.positionId = positionId;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
        this.hourlyRate = calculateHourlyRate(basicSalary); // Example calculation
        this.grossSemiMonthlyRate = calculateGrossSemiMonthlyRate(basicSalary); // Example calculation
    }

    // Example methods to calculate hourly rate and gross semi-monthly rate
    private Double calculateHourlyRate(Double basicSalary) {
        // Assuming a standard 40-hour work week and 2 weeks in a semi-monthly pay period
        return basicSalary / (40 * 2);
    }

    private Double calculateGrossSemiMonthlyRate(Double basicSalary) {
        // Assuming semi-monthly pay
        return basicSalary / 2;
    }

    // Getters and Setters
    public Integer getPositionSalaryHistoryId() {
        return positionSalaryHistoryId;
    }

    public void setPositionSalaryHistoryId(Integer positionSalaryHistoryId) {
        this.positionSalaryHistoryId = positionSalaryHistoryId;
    }

    public Integer getEmployeeId() {
        return empId;
    }

    public void setEmployeeId(Integer empId) {
        this.empId = empId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
        this.hourlyRate = calculateHourlyRate(basicSalary); // Update hourly rate
        this.grossSemiMonthlyRate = calculateGrossSemiMonthlyRate(basicSalary); // Update gross semi-monthly rate
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public Double getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }

    public Double getRiceSubsidy() {
        return riceSubsidy;
    }

    public void setRiceSubsidy(Double riceSubsidy) {
        this.riceSubsidy = riceSubsidy;
    }

    public Double getPhoneAllowance() {
        return phoneAllowance;
    }

    public void setPhoneAllowance(Double phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }

    public Double getClothingAllowance() {
        return clothingAllowance;
    }

    public void setClothingAllowance(Double clothingAllowance) {
        this.clothingAllowance = clothingAllowance;
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
        return "PositionSalaryHistory{" +
                "positionSalaryHistoryId=" + positionSalaryHistoryId +
                ", empId=" + empId +
                ", positionId=" + positionId +
                ", basicSalary=" + basicSalary +
                ", hourlyRate=" + hourlyRate +
                ", grossSemiMonthlyRate=" + grossSemiMonthlyRate +
                ", riceSubsidy=" + riceSubsidy +
                ", phoneAllowance=" + phoneAllowance +
                ", clothingAllowance=" + clothingAllowance +
                ", effectiveStartDate=" + effectiveStartDate +
                ", effectiveEndDate=" + effectiveEndDate +
                '}';
    }
}
   
