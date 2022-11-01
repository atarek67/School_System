/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author TIK
 */
public class Student extends Person{
    private String parentPhoneNumber;

   

    public Student(){}

    @Override
    public String getData() {
        return "Name: " + this.getName() + " ,Age: "+this.getAge() + " ,PhoneNumber: "+this.getParentPhoneNumber();
    }

    public Student(String parentPhoneNumber, String name, int age) {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }
    
    
    
}
