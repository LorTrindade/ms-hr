package com.lortrindade.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lortrindade.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}