package com.example.management.controllers;

import com.example.management.models.Employee;
import com.example.management.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController extends BaseController<Employee> {

    public EmployeeController(Repo<Employee> repo) {
        super(repo);
    }
}
