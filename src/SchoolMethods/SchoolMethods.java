package SchoolMethods;

import Classes.School;
import Classes.Student;
import Classes.Teacher;
import Classes.Grade;
import Classes.Person;

public class SchoolMethods {
    School school;

    public SchoolMethods(School school) {
        this.school = school;
    }
    
    public void addStudent(Student student){
        this.school.getStudent().add(student);
    }
    
    public void addGrade(Grade grade){
        this.school.getGrades().add(grade);
    }
    
    public void addTeacher(Teacher teacher){
        this.school.getTeacher().add(teacher);
    }
    
    public void removeStudent(Student student){
        this.school.getStudent().remove(student);
    }
    public void removeTeacher(Teacher teacher){
        this.school.getTeacher().remove(teacher);
    }
    public void removeGrade(Grade grade){
        this.school.getGrades().remove(grade);
    }
    
    public Student getStudentByName(String name){
        Student s = null;
    for(Student student : this.school.getStudent()){
    
        if(student.getName().toUpperCase().equals(name.toUpperCase()))
            s = student;
            break;
    }
                return s;
    }
    
    public Teacher getTeacherByName(String name){
        Teacher t = null;
        for(Teacher teacher : this.school.getTeacher()){
            if(teacher.getName().toUpperCase().equals(name.toUpperCase()))
                t= teacher;
                break;
        
    }
        return t;
}

    public Grade getGradeByCode(String code){
    
        Grade g = null;
        for(Grade grade : this.school.getGrades()){
            if(g.getCode().equals(code))
                g = grade;
        }
        return g;
    }
    
    public Grade getGradeByName(String name){
    
        Grade g = null;
        for(Grade grade : this.school.getGrades()){
            if(g.getName().equals(name))
                g = grade;
        }
        return g;
    }

    public School getSchool(){
        return school;
    }
    
   

}
