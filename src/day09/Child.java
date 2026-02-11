package day09;

public class Child extends Father{
    boolean isChild;

    public Child() {
        super();
    }

    @Override
    public String toString() {
        return "Child{" +
                "isChild=" + isChild +
                ", work='" + work + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", fatherOf='" + fatherOf + '\'' +
                '}';
    }

    public Child(String name, String role, int age, String fatherOf, String work){
        super(name, role, age, fatherOf,work);
        this.isChild = true;
    }

}
