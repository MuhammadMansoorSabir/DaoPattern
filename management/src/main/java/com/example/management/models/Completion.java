package com.example.management.models;

import javax.persistence.*;

@Entity
@Table(name="completion")
public class Completion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;

    public Completion(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public Completion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
