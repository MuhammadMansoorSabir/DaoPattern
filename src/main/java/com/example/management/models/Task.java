package com.example.management.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @NotNull
        private String TaskName;
        @OneToOne(targetEntity = Completion.class,cascade = CascadeType.ALL)
        private Completion status;

        @ManyToOne
        @JoinColumn(name = "employee_id")
        Employee employee;

        public Employee getEmployee() {
                return employee;
        }

        public void setEmployee(Employee employee) {
                this.employee = employee;
        }

        public Task() {
        }

        public Task(int id, String taskName, Completion status) {
                this.id = id;
                TaskName = taskName;
                this.status = status;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getTaskName() {
                return TaskName;
        }

        public void setTaskName(String taskName) {
                TaskName = taskName;
        }

        public Completion getStatus() {
                return status;
        }

        public void setStatus(Completion status) {
                this.status = status;
        }
}
