package com.example.management.services;

import com.example.management.repo.Dao;
import com.example.management.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public abstract class GenericService<T> implements Dao<T> {

     private final Repo<T> repo;
     public GenericService(Repo<T> repo) {
        this.repo = repo;
    }

    public List<T> getAll() {
        return repo.findAll();
    }

    public void delete(int id) {
        boolean exist =repo.existsById(id);
        if(!exist){
            throw new IllegalStateException("id doesn't exist");
        }
         repo.deleteById(id);
    }

    public T insert(T t) {
         return repo.save(t);
    }
    public T update(T t) {
        return repo.save(t);
    }
}
