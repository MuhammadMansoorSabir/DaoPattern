package com.example.management.controllers;
import com.example.management.repo.Repo;
import com.example.management.services.GenericService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

    public abstract class BaseController <T>{
    private final GenericService<T> service;

    public BaseController(Repo<T> repo) {
        this.service = new GenericService<T>(repo){}; {
        };
    }
    @PostMapping
    public String insert(@RequestBody @Valid T t){
        return service.insert(t);
    }
    @GetMapping
    public List<T> getAll(){
        return service.getAll();
    }
    @DeleteMapping(path="{id}")
    public String delete(@PathVariable("id") int id){
            return service.delete(id);
    }
    @PutMapping
    public String update(@RequestBody @Valid  T t){
        return service.update(t);
    }
}
