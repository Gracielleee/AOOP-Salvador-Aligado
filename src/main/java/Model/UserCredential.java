package Model;

/**
 *
 * @author Gracielle Salvador
 */


/**
 * UserCredential model class representing the user's password and role. Currently, the system does not implement password hashing.
 */
class UserCredential {
    private Integer empId;
    private String password;
    private String salt;
    private UserRole userRole;
    
    /**
     * Default constructor
     */
    public UserCredential() {
    }
    
    /**
     * Parameterized constructor
     * @param empId Employee ID
     * @param password User password
     * @param salt Password salt for hashing (UNUSED)
     * @param userRole User role in the system
     */
    public UserCredential(Integer empId, String password, String salt, UserRole userRole) {
        this.empId = empId;
        this.password = password;
        this.salt = salt;
        this.userRole = userRole;
    }
    
    /**
     * Gets the employee ID
     * @return Employee ID
     */
    public Integer getEmpId() {
        return empId;
    }
    
    /**
     * Gets the password
     * @return Password (hashed)
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Gets the salt
     * @return Password salt
     */
    public String getSalt() {
        return salt;
    }
    
    /**
     * Gets the user role
     * @return User role
     */
    public UserRole getUserRole() {
        return userRole;
    }
    
    /**
     * Sets the employee ID
     * @param empId Employee ID to set
     * @return The set employee ID
     */
    public Integer setEmpId(Integer empId) {
        this.empId = empId;
        return this.empId;
    }
    
    /**
     * Sets the password
     * @param password Password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Sets the salt
     * @param salt Salt to set
     * @return The set salt
     */
    public String setSalt(String salt) {
        this.salt = salt;
        return this.salt;
    }
    
    /**
     * Sets the user role
     * @param userRole User role to set
     */
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    
    /**
     * String representation of UserCredential
     * @return String representation
     */
    @Override
    public String toString() {
        return "UserCredential{" +
                "empId=" + empId +
                ", password='" + (password != null ? "[PROTECTED]" : "null") + '\'' +
                ", salt='" + (salt != null ? "[PROTECTED]" : "null") + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}