package Classes;

import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private String phoneNumber;
    
    ArrayList<Student> student;
    ArrayList<Teacher> teacher;
    ArrayList<Grade> grades;

    public School(String name) {
        this.name = name;
        this.Initial();
             
    }

    public School() {
        this.Initial();
        
         }
    
    private void Initial(){
        this.student = new ArrayList<Student>();
        this.teacher = new ArrayList<Teacher>();
        this.grades = new ArrayList<Grade>() ;
    
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    
    
}
