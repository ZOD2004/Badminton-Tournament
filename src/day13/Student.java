package day13;

import java.util.List;

public class Student {
    final private String rollNo;
    private String name;
    private int age;
    private String dept;

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
