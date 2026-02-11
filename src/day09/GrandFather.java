package day09;

public class GrandFather {
    String name;
    String role;
    int age;
    String fatherOf;

    public GrandFather() {

    }

    @Override
    public String toString() {
        return "GrandFather{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", fatherOf='" + fatherOf + '\'' +
                '}';
    }

    public GrandFather(String name, String role, int age, String fatherOf, String work) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.fatherOf = fatherOf;
    }

    public void setRole(String role){
        this.role = role;
    }
}
