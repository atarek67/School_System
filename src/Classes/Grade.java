/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;
import java.util.*;
/**
 *
 * @author TIK
 */
public class Grade {
    private String code;
    private String name;
    
    Teacher teacher;
    ArrayList<Student> student;

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

  
     public ArrayList<Student> getStudent() {
        return student;
    }
     
     public void addStudent(Student student){
     this.student.add(student);
     }

     
     public void removeStudent(Student student){
     this.student.remove(student);
     }
    
}
