package day13;

public class Student {
    private String rollNo;
    private String name;
    private int age;
    private String dept;

    @CusAnno(value = "Sensitive Data", priority = 10)
    private String password;

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String rollNo, String name, int age, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int findGraduationAge(){
        return this.age+4;
    }
}
