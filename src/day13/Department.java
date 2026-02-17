package day13;

public class Department {
    private int deptId;
    private String deptName;
    private String block;
    private String manager;
    private Address location;

    public Department(int deptId, String deptName, String block, String manager, Address location) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.block = block;
        this.manager = manager;
        this.location = location;
    }
}
