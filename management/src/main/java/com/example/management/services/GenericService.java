package com.example.management.services;

import com.example.management.repo.Dao;
import com.example.management.repo.Repo;

import java.util.List;


public abstract class GenericService<T> implements Dao<T> {

     private final Repo<T> repo;
     public GenericService(Repo<T> repo) {
        this.repo = repo;
    }

     public List<T> getAll() {
        return repo.findAll();
    }

     public String delete(int id) {
         try {
             boolean exist = repo.existsById(id);
             System.out.println(exist);
             if (!exist) {
                 throw new IllegalStateException("id doesn't exist");
             }
             repo.deleteById(id);
             return "successfully deleted";
         }
         catch (Exception e){
             return e.getMessage();
         }
    }

     public String insert(T t) {
         try {
             repo.save(t);
             return "inserted successfully";
         }
         catch (Exception e){
             return e.getMessage();
         }
    }
     public String  update(T t) {

         try {
             repo.save(t);
             return "updated successfully";
         }
         catch (Exception e){
             return e.getMessage();
         }
    }
}
