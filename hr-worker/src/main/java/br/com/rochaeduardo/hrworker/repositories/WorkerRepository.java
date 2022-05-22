package br.com.rochaeduardo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rochaeduardo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
