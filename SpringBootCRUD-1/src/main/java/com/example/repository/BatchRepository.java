package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Batches;

public interface BatchRepository extends JpaRepository<Batches, Integer>{

}
