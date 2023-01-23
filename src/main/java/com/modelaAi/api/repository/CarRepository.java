package com.modelaAi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaAi.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
