package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gracielle Salvador
 */


/**
 * ClockHour model class representing employee clock-in and clock-out time data.
 */
class ClockHour {
    private Integer clockHourId;
    private Integer employeeId;
    private LocalDateTime clockInTime;
    private LocalDateTime clockOutTime;
    private Double hoursWorked;
    
    /**
     * Default constructor
     */
    public ClockHour() {
    }
    
    /**
     * Parameterized constructor
     * @param employeeId Employee ID
     * @param clockInTime Clock in time
     * @param clockOutTime Clock out time
     * @param hoursWorked Total hours worked
     */
    public ClockHour(Integer employeeId, LocalDateTime clockInTime, 
                     LocalDateTime clockOutTime, Double hoursWorked) {
        this.employeeId = employeeId;
        this.clockInTime = clockInTime;
        this.clockOutTime = clockOutTime;
        this.hoursWorked = hoursWorked;
    }
    
    /**
     * Gets the clock hour ID
     * @return Clock hour ID
     */
    public Integer getClockHourId() {
        return clockHourId;
    }
    
    /**
     * Gets the employee ID
     * @return Employee ID
     */
    public Integer getEmployeeId() {
        return employeeId;
    }
    
    /**
     * Gets the clock in time
     * @return Clock in time
     */
    public LocalDateTime getClockInTime() {
        return clockInTime;
    }
    
    /**
     * Gets the clock out time
     * @return Clock out time
     */
    public LocalDateTime getClockOutTime() {
        return clockOutTime;
    }
    
    /**
     * Gets the hours worked
     * @return Hours worked
     */
    public Double getHoursWorked() {
        return hoursWorked;
    }
    
    /**
     * Sets the clock hour ID
     * @param clockHourId Clock hour ID to set
     */
    public void setClockHourId(Integer clockHourId) {
        this.clockHourId = clockHourId;
    }
    
    /**
     * Sets the employee ID
     * @param employeeId Employee ID to set
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    
    /**
     * Sets the clock in time
     * @param clockInTime Clock in time to set
     */
    public void setClockInTime(LocalDateTime clockInTime) {
        this.clockInTime = clockInTime;
    }
    
    /**
     * Sets the clock out time
     * @param clockOutTime Clock out time to set
     */
    public void setClockOutTime(LocalDateTime clockOutTime) {
        this.clockOutTime = clockOutTime;
    }
    
    /**
     * Sets the hours worked
     * @param hoursWorked Hours worked to set
     */
    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    /**
     * String representation of ClockHour
     * @return String representation
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "ClockHour{" +
                "clockHourId=" + clockHourId +
                ", employeeId=" + employeeId +
                ", clockInTime=" + (clockInTime != null ? clockInTime.format(formatter) : "null") +
                ", clockOutTime=" + (clockOutTime != null ? clockOutTime.format(formatter) : "null") +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}