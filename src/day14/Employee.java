package day14;

public class Employee {
    private String empFirstName;
    private String empLastName;
    transient private int empId;
    private double empSalary;
    Department dept;
    private Address empAddress;

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }

    public Employee(String empFirstName, String empLastName, int empId, double empSalary, Department dept, Address empAddress) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.dept = dept;
        this.empAddress = empAddress;
    }
}
