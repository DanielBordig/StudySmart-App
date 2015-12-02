package com.example.danielbordig.studysmartapp;

import java.util.ArrayList;

/**
 * Created by Daniel Bordig on 30-11-2015.
 */
public class StudentDAO {

    ArrayList<StudentDTO> studentList;

    public StudentDAO() {
        studentList = new ArrayList<StudentDTO>();
        studentList.add(new StudentDTO(1, "Daniel", "qwert"));
        studentList.add(new StudentDTO(2, "Zohra", "12345"));
        studentList.add(new StudentDTO(3, "Geziena", "asdf"));
        studentList.add(new StudentDTO(4, "Nicklas", "zxcv"));
        studentList.add(new StudentDTO(5, "Bob", "trewq"));
        studentList.add(new StudentDTO(6, "q", "q"));
    }

    public ArrayList<StudentDTO> getStudents(){
        return studentList;
    }

    public boolean Login(String name, String password){
        for(int i = 0; i < studentList.size(); i++) {
        if(studentList.get(i).name.equals(name) && studentList.get(i).password.equals(password)){
            return true;
        }
    }
        return false;
    }
}
