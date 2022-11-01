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
public class Teacher extends Person{
    private float salary;

    public Teacher() {
    }

    @Override
    public String getData() {
        return "Name: " + this.getName() + " ,Age: "+this.getAge() + " ,Salary: "+ this.getSalary();
    }

    public Teacher(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
