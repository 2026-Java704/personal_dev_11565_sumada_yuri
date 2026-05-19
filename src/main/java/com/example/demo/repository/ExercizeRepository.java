package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Exercize;

public interface ExercizeRepository extends JpaRepository<Exercize, Integer> {

}