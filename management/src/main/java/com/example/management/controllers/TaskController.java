package com.example.management.controllers;

import com.example.management.models.Employee;
import com.example.management.models.Task;
import com.example.management.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/task")
public class TaskController extends BaseController<Task> {

    public TaskController(Repo<Task> repo) {
        super(repo);
    }
}
