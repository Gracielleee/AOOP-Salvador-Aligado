package Model;

import java.time.LocalDate;
/**
 *
 * @author Gracielle Salvador
 */

/**
 * Represents an employee that is also a ssytem user.
 */
public class Employee {
    private Integer empId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private EmploymentStatus empStatus;
    private Department department;
    private Integer supervisorId;
    private Integer positionSalaryHistoryId;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String firstName, String lastName, Gender gender, LocalDate birthday,
                    String phoneNumber, String sssNumber, String philhealthNumber,
                    String tinNumber, String pagibigNumber, EmploymentStatus empStatus,
                    Department department, Integer supervisorId, Integer positionSalaryHistoryId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.empStatus = empStatus;
        this.department = department;
        this.supervisorId = supervisorId;
        this.positionSalaryHistoryId = positionSalaryHistoryId;
    }
    
    // Getters and Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSssNumber() {
        return sssNumber;
    }

    public void setSssNumber(String sssNumber) {
        this.sssNumber = sssNumber;
    }

    public String getPhilhealthNumber() {
        return philhealthNumber;
    }

    public void setPhilhealthNumber(String philhealthNumber) {
        this.philhealthNumber = philhealthNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getPagibigNumber() {
        return pagibigNumber;
    }

    public void setPagibigNumber(String pagibigNumber) {
        this.pagibigNumber = pagibigNumber;
    }

    public EmploymentStatus getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(EmploymentStatus empStatus) {
        this.empStatus = empStatus;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public Integer getPositionSalaryHistoryId() {
        return positionSalaryHistoryId;
    }

    public void setPositionSalaryHistoryId(Integer positionSalaryHistoryId) {
        this.positionSalaryHistoryId = positionSalaryHistoryId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sssNumber='" + sssNumber + '\'' +
                ", philhealthNumber='" + philhealthNumber + '\'' +
                ", tinNumber='" + tinNumber + '\'' +
                ", pagibigNumber='" + pagibigNumber + '\'' +
                ", empStatus=" + empStatus +
                ", department=" + department + '\'' +
                ", supervisorId=" + supervisorId + '\'' +
                ", positionSalaryHistoryId=" + positionSalaryHistoryId + '\'';}
}