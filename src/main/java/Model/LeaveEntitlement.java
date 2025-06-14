package Model;
/**
 *
 * @author Gracielle Salvador
 */

/**
 * Represents the leave entitlement for an employee in a given year and type.
 */
public class LeaveEntitlement {
    private static int leaveEntitlementId;
    private static Integer employeeId;
    private static Integer leaveTypeId;
    private static Integer entitlementDays;
    private static Integer year;

    /**
     * Constructs a LeaveEntitlement instance.
     *
     * @param employeeId the ID of the employee
     * @param leaveTypeId the ID of the leave type
     * @param entitlementDays number of leave days entitled to
     * @param year the year the entitlement is applicable to
     */
    public LeaveEntitlement(Integer employeeId,
                            Integer leaveTypeId,
                            Integer EntitlementDays,
                            Integer year) {
    }

    public static int getLeaveEntitlementId() {
        return leaveEntitlementId;
    }

    public static void setLeaveEntitlementId(int leaveEntitlementId) {
        LeaveEntitlement.leaveEntitlementId = leaveEntitlementId;
    }

    public static Integer getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(Integer employeeId) {
        LeaveEntitlement.employeeId = employeeId;
    }

    public static Integer getLeaveTypeId() {
        return leaveTypeId;
    }

    public static void setLeaveTypeId(Integer leaveTypeId) {
        LeaveEntitlement.leaveTypeId = leaveTypeId;
    }

    public static Integer getEntitlementDays() {
        return entitlementDays;
    }

    public static void setEntitlementDays(Integer EntitlementDays) {
        LeaveEntitlement.entitlementDays = EntitlementDays;
    }

    public static Integer getYear() {
        return year;
    }

    public static void setYear(Integer year) {
        LeaveEntitlement.year = year;
    }
    
    @Override
    public String toString() {
        return "LeaveEntitlement{" + "leaveEntitlementId=" + leaveEntitlementId + 
                              ", employeeId=" + employeeId + 
                              ", leaveTypeId=" + leaveTypeId +
                              ", entitlementDays=" + entitlementDays +
                              ", year=" + year + '}';
    }
    
    
}