package org.school.service;

import org.school.model.Student;

import java.util.List;
public interface DataService {

    public void save(Student student);
   // public List<Student> getStudent(String firstName);
    public long getCountOfAllStudent();
    public void dataDeleteAll();

}
