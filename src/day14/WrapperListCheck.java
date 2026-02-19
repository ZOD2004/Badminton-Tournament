package day14;

import java.util.List;

public class WrapperListCheck {
    public String name;
    public int age;
    public String role;
    public List<?> intList;


    public WrapperListCheck(String name, int age, String role, List<?> intList) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.intList = intList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<?> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
