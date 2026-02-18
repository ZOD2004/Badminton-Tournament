package day14;

import day13.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckList {
//    public List<?> getList() {
//        return list;
//    }
//
//    public void setList(List<?> list) {
//        this.list = list;
//    }

    public List<Student> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Student> empList) {
        this.empList = empList;
    }

    public CheckList(List<Student> empList) {
        this.empList = empList;
    }

    //    public List<?>list = new ArrayList<>();
    public List<Student> empList;
}
