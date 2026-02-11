package day09;

public class Father extends GrandFather{
    String work;

    public Father() {
        super();
    }

    @Override
    public String toString() {
        return "Father{" +
                "work='" + work + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", fatherOf='" + fatherOf + '\'' +
                '}';
    }

    public Father(String name, String role, int age, String fatherOf, String work) {
        super(name, role, age, fatherOf, work);
        this.work=work;
    }


}
