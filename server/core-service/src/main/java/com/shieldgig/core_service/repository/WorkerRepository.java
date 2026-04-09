package com.shieldgig.core_service.repository;

import com.shieldgig.core_service.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
    Worker findByPhone(String phone);
}