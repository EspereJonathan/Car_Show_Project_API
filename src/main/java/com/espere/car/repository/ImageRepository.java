package com.espere.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository<Image> extends JpaRepository<Image, Long> {
}
