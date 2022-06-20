package com.example.management.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
    @JoinColumn(name="emp_fk",referencedColumnName = "id")
    private List<Task> tasks;
    @OneToOne(targetEntity = Salary.class,cascade = CascadeType.MERGE )
    private Salary salary;
    @OneToOne(targetEntity = Branch.class,cascade = CascadeType.MERGE )
    private Branch branch;

    public Employee() {
    }

    public Employee(int id, String name, Salary salary, Branch branch) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.branch = branch;
    }

    public Employee(int id, String name, List<Task> tasks, Salary salary, Branch branch) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.salary = salary;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
