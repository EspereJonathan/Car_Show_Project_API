package com.espere.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository<Appointment> extends JpaRepository<Appointment, Long> {
}

