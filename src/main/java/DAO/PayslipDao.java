package DAO;  
import java.util.List;
import Model.Payslip;
/**
 *
 * @author Trisha Quismundo
 */
public interface PayslipDao {
    /**
    * @param employeeId The ID of the employee.
    * @param payPeriodId The ID of the pay period.
    * @return A List of Payslip objects, which may be empty if none are found.
    */
    
    //Method for retrieving Payslip by PayslipID
    Payslip getPayslipByID(int payslipId);
    
    List<Payslip>getPayslipByEmployeeID(int employeeId);
    
    List<Payslip>getPayslipByPayPeriod(int payPeriodId);
    
    List<Payslip>getPayslipByEmpId_PayPeriodId(int employeeId, int payPeriodId);
    
    List<Payslip>getAllPayslips();
    
    boolean addPayslip(Payslip payslip);
    boolean updatePayslip(Payslip payslip);
    boolean deletePayslip(Payslip payslip);
}
