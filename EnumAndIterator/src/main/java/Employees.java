/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Employees {
    
    private List<Person> employees;
    
    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while(iterator.hasNext()) {
            this.employees.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
       Iterator<Person> iterator = employees.iterator();
       while (iterator.hasNext()) {
           Person employee = iterator.next();
           if(employee.getEducation().equals(education)) {
                System.out.println(employee);
            }    
        } 
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
           if(iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
       }
    }
}
