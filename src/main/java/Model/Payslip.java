package Model;
import DAO.PayslipDao;
/**
 *
 * @author Trisha Quismundo
 */
public abstract class Payslip implements PayslipDao{
    private static int payslipId;
    private static int employeeId;
    private static int payPeriodId;
    private static double daysWorked;
    private static double totalHoursWorked;
    private static double totalOvertimeHours;
    private static double grossIncome;
    private static double totalBenefits;
    private static int taxAndDeductionId;
    private static double netIncome;
    

    //Constructor
    public Payslip(int payslipId, int employeeId, int payPeriodId, double daysWorked,double totalHoursWorked, 
                   double totalOvertimeHours, double grossIncome, double totalBenefits, int taxAndDeductionId, double netIncome) 
    {
        this.payslipId = payslipId;
        this.employeeId = employeeId;
        this.payPeriodId = payPeriodId;
        this.daysWorked = daysWorked;
        this.totalHoursWorked = totalHoursWorked;
        this.totalOvertimeHours = totalOvertimeHours;
        this.grossIncome = grossIncome;
        this.totalBenefits = totalBenefits;
        this.taxAndDeductionId = taxAndDeductionId;
        this.netIncome = netIncome;
    }
    
    // Getters and Setters for Payslip Methods
    public static int getPayslipId() {
        return payslipId;
    }

    public static void setPayslipId(int payslipId) {
        Payslip.payslipId = payslipId;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(int employeeId) {
        Payslip.employeeId = employeeId;
    }

    public static int getPayPeriodId() {
        return payPeriodId;
    }

    public static void setPayPeriodId(int payPeriodId) {
        Payslip.payPeriodId = payPeriodId;
    }

    public static double getDaysWorked() {
        return daysWorked;
    }

    public static void setDaysWorked(double daysWorked) {
        Payslip.daysWorked = daysWorked;
    }

    public static double getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public static void setTotalHoursWorked(double totalHoursWorked) {
        Payslip.totalHoursWorked = totalHoursWorked;
    }

    public static double getTotalOvertimeHours() {
        return totalOvertimeHours;
    }

    public static void setTotalOvertimeHours(double totalOvertimeHours) {
        Payslip.totalOvertimeHours = totalOvertimeHours;
    }

    public static double getGrossIncome() {
        return grossIncome;
    }

    public static void setGrossIncome(double grossIncome) {
        Payslip.grossIncome = grossIncome;
    }

    public static double getTotalBenefits() {
        return totalBenefits;
    }

    public static void setTotalBenefits(double totalBenefits) {
        Payslip.totalBenefits = totalBenefits;
    }

    public static int getTaxAndDeductionID() {
        return taxAndDeductionId;
    }

    public static void setTaxAndDeductionID(int taxAndDeductionID) {
        Payslip.taxAndDeductionId = taxAndDeductionID;
    }

    public static double getNetIncome() {
        return netIncome;
    }

    public static void setNetIncome(double netIncome) {
        Payslip.netIncome = netIncome;
    }

    @Override
    public String toString() {
        return "Payslip{" +
                "payslipId=" + payslipId +
                ", employeeId=" + employeeId +
                ", payPeriodId=" + payPeriodId +
                ", daysWorked=" + daysWorked +
                ", totalHoursWorked=" + totalHoursWorked +
                ", totalOvertimeHours=" + totalOvertimeHours +
                ", grossIncome=" + grossIncome +
                ", totalBenefits=" + totalBenefits +
                ", employeeId=" + employeeId +
                ", taxAndDeductionID=" + taxAndDeductionId +
                ", netIncome=" + netIncome +
                '}';
    }
}
