package com.shieldgig.core_service.controller;

import com.shieldgig.core_service.model.Worker;
import com.shieldgig.core_service.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/status")
    public String status() {
        return "ShieldGig Core Service is RUNNING!";
    }

    @PostMapping("/onboard")
    public ResponseEntity<Worker> onboardWorker(@RequestBody Worker worker) {
        Worker savedWorker = workerRepository.save(worker);
        return ResponseEntity.ok(savedWorker);
    }
    
    @GetMapping("/all")
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }
}