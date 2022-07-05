package com.example.management.models;
import com.sun.istack.NotNull;
import org.springframework.data.repository.NoRepositoryBean;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;
@Entity
@Table(name="employee_tbl")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Email(message = "enter a valid email address")
    private String email;

    @NotBlank(message = "name cannot be blank")
    @Size(min = 2, message = "name should have at least 2 characters")
    private String name;
    @OneToMany(targetEntity = Task.class,cascade = CascadeType.ALL)
    @JoinColumn(name="emp_fk",referencedColumnName = "id")
    private List<Task> tasks;
    @OneToOne(targetEntity = Salary.class,cascade = CascadeType.ALL )
    private Salary salary;
    @OneToOne(targetEntity = Branch.class,cascade = CascadeType.ALL )
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
    public Employee(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
