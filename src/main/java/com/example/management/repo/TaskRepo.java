package com.example.management.repo;

import com.example.management.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface TaskRepo extends Repo<Task>{
}
