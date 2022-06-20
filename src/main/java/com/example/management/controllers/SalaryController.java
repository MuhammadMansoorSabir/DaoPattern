package com.example.management.controllers;

import com.example.management.models.Employee;
import com.example.management.models.Salary;
import com.example.management.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/salary")
public class SalaryController extends BaseController<Salary> {

    public SalaryController(Repo<Salary> repo) {
        super(repo);
    }
}
