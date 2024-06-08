package com.espere.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository<Car> extends JpaRepository<Car, Long> {
}
