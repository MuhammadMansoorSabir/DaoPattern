package com.example.management.controllers;

import com.example.management.models.Branch;
import com.example.management.repo.Repo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/branch")
public class BranchController extends BaseController<Branch>{
    public BranchController(Repo<Branch> repo) {
        super(repo);
    }
}
