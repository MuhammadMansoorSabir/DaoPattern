package com.example.management.repo;

import com.example.management.models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepo extends Repo<Branch> {
}
