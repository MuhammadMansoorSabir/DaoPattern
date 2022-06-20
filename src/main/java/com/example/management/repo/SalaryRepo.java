package com.example.management.repo;

import com.example.management.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepo extends Repo<Salary> {
}
