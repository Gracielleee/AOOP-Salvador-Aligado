package Model;

import java.time.LocalDate;

/**
 *
 * @author Gracielle Salvador
 */
public class BonusAndIncentive{
    private static int bonusId;
    private static Integer employeeId;
    private static Integer bonusTypeId;
    private static Double amount;
    private static LocalDate dateGiven;
    
    
    public void BonusAndIncentive(Integer employeeId, 
                                  Integer bonusTypeId,
                                  Double amount,
                                  LocalDate dateGiven){
                                return;
    }

    public static int getBonusId() {
        return bonusId;
    }

    public static void setBonusId(int bonusId) {
        BonusAndIncentive.bonusId = bonusId;
    }

    public static Integer getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(Integer employeeId) {
        BonusAndIncentive.employeeId = employeeId;
    }

    public static Integer getBonusTypeId() {
        return bonusTypeId;
    }

    public static void setBonusTypeId(Integer bonusTypeId) {
        BonusAndIncentive.bonusTypeId = bonusTypeId;
    }

    public static Double getAmount() {
        return amount;
    }

    public static void setAmount(Double amount) {
        BonusAndIncentive.amount = amount;
    }

    public static LocalDate getDateGiven() {
        return dateGiven;
    }

    public static void setDateGiven(LocalDate dateGiven) {
        BonusAndIncentive.dateGiven = dateGiven;
    }

    @Override
    public String toString() {
        return "BonusAndIncentive{" + "bonusId=" + bonusId + 
                                  ", employeeId=" + employeeId + 
                                  ", bonusTypeId=" + bonusTypeId + 
                                  ", amount=" + amount + 
                                  ", dateGiven=" + dateGiven + '}';
    }
    
}
