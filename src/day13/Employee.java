package day13;

public class Employee {
    private String empFirstName;
    private String empLastName;
    private int empId;
    private double empSalary;
    Department dept;
    private Address empAddress;

    public Employee(String empFirstName, String empLastName, int empId, double empSalary, Department dept, Address empAddress) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.dept = dept;
        this.empAddress = empAddress;
    }
}
