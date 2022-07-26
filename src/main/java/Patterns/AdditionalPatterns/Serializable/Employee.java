package Patterns.AdditionalPatterns.Serializable;

import java.io.Serializable;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/26/2022 - 1:00 PM
 */
public class Employee implements Serializable {
    private String name;
    private int id;
    transient private int salary;

    @Override
    public String toString(){
        return "Employee{name="+name+",id="+id+",salary="+salary+"}";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
