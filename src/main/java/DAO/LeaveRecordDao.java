package DAO;

import Model.LeaveRecord;
import Model.LeaveStatus;
import java.util.List;

/**
 *
 * @author Gracielle Salvador
 */


/**
 * Data Access Object for managing Leave Records (applications).
 */
public interface LeaveRecordDao {

    /**
     * Retrieves a LeaveRecord by its ID.
     *
     * @param leaveRecordId the ID of the leave record
     * @return the corresponding LeaveRecord object, or null if not found
     */
    LeaveRecord getLeaveRecordById(int leaveRecordId);

    /**
     * Retrieves all leave records for a specific employee.
     *
     * @param employeeId the employee's ID
     * @return list of LeaveRecord records
     */
    List<LeaveRecord> getLeaveRecordsByEmployeeId(Integer employeeId);

    /**
     * Retrieves all leave records with a specific status.
     *
     * @param status the leave status
     * @return list of LeaveRecord records
     */
    List<LeaveRecord> getLeaveRecordsByStatus(LeaveStatus status);

    /**
     * Retrieves leave records by employee ID and status.
     *
     * @param employeeId the employee's ID
     * @param status the leave status
     * @return list of LeaveRecord records
     */
    List<LeaveRecord> getLeaveRecordsByEmployeeIdAndStatus(Integer employeeId, LeaveStatus status);

    /**
     * Retrieves all leave records.
     *
     * @return list of all LeaveRecord records
     */
    List<LeaveRecord> getAllLeaveRecords();

    /**
     * Adds a new LeaveRecord.
     *
     * @param leaveRecord the LeaveRecord to add
     * @return true if addition was successful
     */
    boolean addLeaveRecord(LeaveRecord leaveRecord);

    /**
     * Updates an existing LeaveRecord.
     *
     * @param leaveRecord the LeaveRecord with updated data
     * @return true if update was successful
     */
    boolean updateLeaveRecord(LeaveRecord leaveRecord);

    /**
     * Deletes a LeaveRecord by its ID.
     *
     * @param leaveRecordId the ID of the LeaveRecord to delete
     * @return true if deletion was successful
     */
    boolean deleteLeaveRecord(int leaveRecordId);
}
