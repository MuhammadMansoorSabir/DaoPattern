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
        @OneToOne(targetEntity = Completion.class,cascade = CascadeType.MERGE)
        private Completion status;

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
