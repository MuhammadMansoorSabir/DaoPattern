package com.example.management.controllers;
import com.example.management.repo.Repo;
import com.example.management.services.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    public abstract class BaseController <T>{
    private final GenericService<T> service;

    public BaseController(Repo<T> repo) {
        this.service = new GenericService<T>(repo){}; {
        };
    }
    @PostMapping
    public T insert(@RequestBody T t){
        return service.insert(t);
    }
    @GetMapping
    public List<T> getAll(){
        return service.getAll();
    }
    @DeleteMapping(path="{id}")
    public void delete(@PathVariable("id") int id){
            service.delete(id);
    }
    @PutMapping
    public T update(@RequestBody T t){
        return service.update(t);
    }
}
