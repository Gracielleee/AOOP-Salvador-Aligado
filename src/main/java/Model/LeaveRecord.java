package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Gracielle Salvador
 */

/**
 * Represents a leave application made by an employee.
 */
public class LeaveRecord {
    private static int leaveRecordId;
    private static Integer employeeId;
    private static Integer leaveTypeId;
    private static LocalDate applicationDate;
    private static LocalDate appliedStartDate;
    private static LocalDate appliedEndDate;
    private static Double daysUsed;
    private static String reason;
    private static LeaveStatus status;
    private static Integer statusUpdatedBy;
    private static LocalDateTime statusUpdatedAt;
    private static String remarks;

    /**
     * Constructs a LeaveRecord instance.
     *
     * @param employeeId the employee's ID
     * @param leaveTypeId the leave type ID
     * @param applicationDate the date the leave was filed
     * @param appliedStartDate the start date of the leave
     * @param appliedEndDate the end date of the leave
     * @param daysUsed the number of leave days used
     * @param reason the reason for the leave
     * @param status the current status of the leave
     * @param statusUpdatedBy the ID of the approver/reviewer
     * @param statusUpdatedAt the timestamp when the status was updated
     * @param remarks any additional remarks
     */
    public LeaveRecord(Integer employeeId,
                       Integer leaveTypeId,
                       LocalDate applicationDate,
                       LocalDate appliedStartDate,
                       LocalDate appliedEndDate,
                       Double daysUsed,
                       String reason,
                       LeaveStatus status,
                       Integer statusUpdatedBy,
                       LocalDateTime statusUpdatedAt,
                       String remarks) {
    }

    public static int getLeaveRecordId() {
        return leaveRecordId;
    }

    public static void setLeaveRecordId(int leaveRecordId) {
        LeaveRecord.leaveRecordId = leaveRecordId;
    }

    public static Integer getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(Integer employeeId) {
        LeaveRecord.employeeId = employeeId;
    }

    public static Integer getLeaveTypeId() {
        return leaveTypeId;
    }

    public static void setLeaveTypeId(Integer leaveTypeId) {
        LeaveRecord.leaveTypeId = leaveTypeId;
    }

    public static LocalDate getApplicationDate() {
        return applicationDate;
    }

    public static void setApplicationDate(LocalDate applicationDate) {
        LeaveRecord.applicationDate = applicationDate;
    }

    public static LocalDate getAppliedStartDate() {
        return appliedStartDate;
    }

    public static void setAppliedStartDate(LocalDate appliedStartDate) {
        LeaveRecord.appliedStartDate = appliedStartDate;
    }

    public static LocalDate getAppliedEndDate() {
        return appliedEndDate;
    }

    public static void setAppliedEndDate(LocalDate appliedEndDate) {
        LeaveRecord.appliedEndDate = appliedEndDate;
    }

    public static Double getDaysUsed() {
        return daysUsed;
    }

    public static void setDaysUsed(Double daysUsed) {
        LeaveRecord.daysUsed = daysUsed;
    }

    public static String getReason() {
        return reason;
    }

    public static void setReason(String reason) {
        LeaveRecord.reason = reason;
    }

    public static LeaveStatus getStatus() {
        return status;
    }

    public static void setStatus(LeaveStatus status) {
        LeaveRecord.status = status;
    }

    public static Integer getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public static void setStatusUpdatedBy(Integer statusUpdatedBy) {
        LeaveRecord.statusUpdatedBy = statusUpdatedBy;
    }

    public static LocalDateTime getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public static void setStatusUpdatedAt(LocalDateTime statusUpdatedAt) {
        LeaveRecord.statusUpdatedAt = statusUpdatedAt;
    }

    public static String getRemarks() {
        return remarks;
    }

    public static void setRemarks(String remarks) {
        LeaveRecord.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LeaveRecord{" + "leaveRecordId=" + leaveRecordId + 
                              ", employeeId=" + employeeId + 
                              ", leaveTypeId=" + leaveTypeId +
                              ", applicationDate=" + applicationDate +
                              ", appliedStartDate=" + appliedStartDate +
                              ", appliedEndDate=" + appliedEndDate + 
                              ", daysUsed=" + daysUsed +
                              ", reason=" + reason +
                              ", status=" + status +
                              ", statusUpdatedBy=" + statusUpdatedBy +
                              ", statusUpdatedAt=" + statusUpdatedAt + 
                              ", remarks=" + remarks + '}';
    }
}