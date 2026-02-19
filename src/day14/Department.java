package day14;

public class Department {
    private int deptId;
    private String deptName;
    private String block;
    private String manager;
    private Address location;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public Department(int deptId, String deptName, String block, String manager, Address location) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.block = block;
        this.manager = manager;
        this.location = location;
    }
}
