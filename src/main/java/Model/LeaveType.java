package Model;
/**
 *
 * @author Gracielle Salvador
 */

/**
 * Represents a type of leave, such as SIL leave, or parental leave.
 */
public class LeaveType {
    private static int leaveTypeId;
    private static String name;
    private static String description;
    private static Integer maxDaysAllowed;
    private static boolean isActive;
    
    /**
     * Constructs a LeaveType instance.
     *
     * @param name the name of the leave type (e.g., "Maternal Leave")
     * @param description a short description of the leave type
     * @param maxDaysAllowed the maximum number of days allowed for this leave type per year
     * @param isActive indicates whether the leave type is currently active
     */
    public LeaveType(String name,
                     String description,
                     Integer maxDaysAllowed,
                     boolean isActive) {
    }

    public static int getLeaveTypeId() {
        return leaveTypeId;
    }

    public static void setLeaveTypeId(int leaveTypeId) {
        LeaveType.leaveTypeId = leaveTypeId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        LeaveType.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        LeaveType.description = description;
    }

    public static Integer getMaxDaysAllowed() {
        return maxDaysAllowed;
    }

    public static void setMaxDaysAllowed(Integer maxDaysAllowed) {
        LeaveType.maxDaysAllowed = maxDaysAllowed;
    }

    public static boolean isIsActive() {
        return isActive;
    }

    public static void setIsActive(boolean isActive) {
        LeaveType.isActive = isActive;
    }
    
    @Override
    public String toString() {
        return "LeaveType{" + "leaveTypeId=" + leaveTypeId + 
                              ", name=" + name + 
                              ", description=" + description +
                              ", maxDaysAllowed=" + maxDaysAllowed +
                              ", isActive=" + isActive + '}';
    }
    
}