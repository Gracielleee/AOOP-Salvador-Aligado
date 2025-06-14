package DAO;
import Model.LeaveEntitlement;
import java.util.List;

/**
 *
 * @author Gracielle Salvador
 */

/**
 * Data Access Object for managing Leave Entitlement records.
 */
public interface LeaveEntitlementDao {

    /**
     * Retrieves a LeaveEntitlement by its unique ID.
     *
     * @param leaveEntitlementId the ID of the leave entitlement
     * @return the corresponding LeaveEntitlement object, or null if not found
     */
    LeaveEntitlement getLeaveEntitlementById(int leaveEntitlementId);

    /**
     * Retrieves all leave entitlements for a given employee in a specific year.
     *
     * @param employeeId the employee's ID
     * @param year the year for which entitlements are retrieved
     * @return list of LeaveEntitlement records
     */
    List<LeaveEntitlement> getLeaveEntitlementsByEmployeeIdAndYear(Integer employeeId, Integer year);

    /**
     * Retrieves all leave entitlements for a specific year.
     *
     * @param year the year
     * @return list of LeaveEntitlement records
     */
    List<LeaveEntitlement> getLeaveEntitlementsByYear(Integer year);

    /**
     * Retrieves all leave entitlements.
     *
     * @return list of all LeaveEntitlement records
     */
    List<LeaveEntitlement> getLeaveEntitlements();

    /**
     * Adds a new LeaveEntitlement record.
     *
     * @param leaveEntitlement the LeaveEntitlement to add
     * @return true if addition was successful
     */
    boolean addLeaveEntitlement(LeaveEntitlement leaveEntitlement);

    /**
     * Updates an existing LeaveEntitlement.
     *
     * @param leaveEntitlement the LeaveEntitlement with updated data
     * @return true if update was successful
     */
    boolean updateLeaveEntitlement(LeaveEntitlement leaveEntitlement);

    /**
     * Deletes a LeaveEntitlement by its ID.
     *
     * @param leaveEntitlementId the ID of the LeaveEntitlement to delete
     * @return true if deletion was successful
     */
    boolean deleteLeaveEntitlement(Integer leaveEntitlementId);
}
