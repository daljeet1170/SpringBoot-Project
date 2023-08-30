package com.hcl.TaskManagement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.TaskManagement.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

