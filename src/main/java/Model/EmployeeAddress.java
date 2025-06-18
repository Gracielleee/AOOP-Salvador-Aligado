package Model;

/**
 *
 * @author Gracielle Salvador
 */

/**
 * Represents the association between an employee and their address, including the type of address.
 */
public class EmployeeAddress {
    private Integer empId;
    private Integer addressId;
    private AddressType addressType;

    // Default constructor
    public EmployeeAddress() {
    }

    // Parameterized constructor
    public EmployeeAddress(Integer empId, Integer addressId, AddressType addressType) {
        this.empId = empId;
        this.addressId = addressId;
        this.addressType = addressType;
    }

    // Getters and Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "empId=" + empId +
                ", addressId=" + addressId +
                ", addressType=" + addressType +
                '}';
    }
}





