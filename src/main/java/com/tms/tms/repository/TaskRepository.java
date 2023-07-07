package com.tms.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.tms.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{
    
}
