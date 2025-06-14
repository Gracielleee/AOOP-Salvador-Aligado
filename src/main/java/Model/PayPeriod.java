package Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Trisha Quismundo
 */
public class PayPeriod {
    private static int payPeriodId;
    private static LocalDate startDate;
    private static LocalDate endDate;
    
    /**
     * @param payPeriodId The ID for the Pay period.
     * @param startDate The start date of a Pay period.
     * @param endDate The end date of a Pay period.
     */
    
    
    public void PayPeriod(LocalDate startDate, LocalDate endDate) {
        return;
    }

    public int getPayPeriodId() {
        return payPeriodId;
    }

    public void setPayPeriodId(int payPeriodId) {
        this.payPeriodId = payPeriodId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "PayPeriod{" + "payPeriodId=" + payPeriodId + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
}
