package DAO;

import Model.LeaveType;
import java.util.List;

/**
 *
 * @author Gracielle Salvador
 */

/**
 * Data Access Object for managing Leave Type definitions.
 */
public interface LeaveTypeDao {

    /**
     * Retrieves a LeaveType by its ID.
     *
     * @param leaveTypeId the ID of the leave type
     * @return the corresponding LeaveType object, or null if not found
     */
    LeaveType getLeaveTypeById(int leaveTypeId);

    /**
     * Retrieves all leave types.
     *
     * @return list of all LeaveType records
     */
    List<LeaveType> getLeaveTypes();

    /**
     * Retrieves all active leave types.
     *
     * @return list of active LeaveType records
     */
    List<LeaveType> getActiveLeaveTypes();

    /**
     * Adds a new LeaveType.
     *
     * @param leaveType the LeaveType to add
     * @return true if addition was successful
     */
    boolean addLeaveType(LeaveType leaveType);

    /**
     * Updates an existing LeaveType.
     *
     * @param leaveType the LeaveType with updated data
     * @return true if update was successful
     */
    boolean updateLeaveType(LeaveType leaveType);

    /**
     * Deletes a LeaveType by its ID.
     *
     * @param leaveTypeId the ID of the LeaveType to delete
     * @return true if deletion was successful
     */
    boolean deleteLeaveType(int leaveTypeId);
}
