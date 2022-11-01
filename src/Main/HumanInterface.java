package Main;

import Classes.Person;
import Classes.School;
import Classes.Student;
import Classes.Teacher;
import SchoolMethods.SchoolMethods;
import Tools.Tools;

import java.util.Scanner;

public class HumanInterface {
    private static SchoolMethods schoolMethods;
    public static void start(){

        Scanner sc = new Scanner(System.in);
        School school = HumanInterface.createSchool();
        System.out.println("**************************************");
        System.out.println("Welcom to " + school.getName() + "\nin "
        + school.getAddress() + "\nFor contact please call us on " + school.getPhoneNumber());
        System.out.println("**************************************");

        String actionTheUserWantToMake;

        do {
            System.out.println("What exactly you want to do?\n -addStudent \n -findStudentByName" +
                   "\n removeStudent  \n -printAllStudents \n -addTeacher  \n -printAllTeachers" +
                    "\n removeStudent  \n -findTeacherByName \n -exit to close the program");
            actionTheUserWantToMake = sc.next();

            switch (actionTheUserWantToMake) {
                case "addStudent" :HumanInterface.addStudent();
                case "addTeacher":HumanInterface.addTeacher();
                case "printAllStudents" : HumanInterface.printAllStudents();
                case "printAllTeachers" : HumanInterface.printAllTeachers();
                case "findStudentByName" : HumanInterface.printDataPersonByName(Tools.TEACHER);
                case "findTeacherByName" : HumanInterface.printDataPersonByName(Tools.STUDENT);
                case "removeStudent" : HumanInterface.removePerson(Tools.STUDENT);
                case "removeTeacher" : HumanInterface.removePerson(Tools.TEACHER);
            }

        }while (!actionTheUserWantToMake.equals("exit"));
    }
    private static School createSchool(){
        School school = new School();
        HumanInterface.schoolMethods = new SchoolMethods(school);
        school.setName("Al Alson Language School");
        school.setAddress("Makram Ebid");
        school.setPhoneNumber("16878");

        return school;
    }
    private static void addStudent(){
        Student student = new Student();
        HumanInterface.setDataPerson(student);
        HumanInterface.schoolMethods.addStudent(student);
    }
    private static void addTeacher(){
        Teacher teacher = new Teacher();
        HumanInterface.setDataPerson(teacher);
        HumanInterface.schoolMethods.addTeacher(teacher);
    }
    public static void printAllStudents(){
        for (Student student: HumanInterface.schoolMethods.getSchool().getStudent()
        ) {
            System.out.println(student.getData());
        }

    }
    public static void printAllTeachers(){
        for (Teacher teacher: HumanInterface.schoolMethods.getSchool().getTeacher()
        ) {
            System.out.println(teacher.getData());
        }

    }
    public static void setDataPerson( Person person){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name");
        person.setName(sc.next()); // el el user haydakhlo hay7oto gwa el dala el esmaha set name
        System.out.println("Please enter the age");
        person.setAge(sc.nextInt()); // el el user haydakhlo hay7oto gwa el dala el esmaha set age
        if(person instanceof Teacher){
            System.out.println("Please enter the salary");
            ((Teacher) person).setSalary(sc.nextFloat()); // el el user haydakhlo hay7oto gwa el dala el esmaha set Phone Number

        }else if(person instanceof Student){
            System.out.println("Please enter the phone number");
            ((Student) person).setParentPhoneNumber(sc.next()); // el el user haydakhlo hay7oto gwa el dala el esmaha set Phone Number
        }


    }
    private static Person findPersonByName(Tools action){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name you want to search for");
        String name = sc.next();
        Person person;
        if (action == Tools.TEACHER){
            person = HumanInterface.schoolMethods.getTeacherByName(name);

        }else{
            person = HumanInterface.schoolMethods.getStudentByName(name);
        }

        return person;
    }
    private static void removePerson(Tools action){

        Person person = HumanInterface.findPersonByName(action);
            if (person instanceof Teacher){
            HumanInterface.schoolMethods.removeTeacher((Teacher) person);
            }
            else {
                HumanInterface.schoolMethods.removeStudent((Student) person);
            }
    }
    private static void printDataPerson(Person person){
        if(person == null){
            System.out.println("Not found!! ");
        }else {
            System.out.println(person.getData());
        }
    }
    private static void printDataPersonByName(Tools action){
        Person person = HumanInterface.findPersonByName(action);
        HumanInterface.printDataPerson(person);
    }
}
