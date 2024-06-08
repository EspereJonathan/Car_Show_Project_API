package com.espere.car.service;

import com.espere.car.entity.Appointment;
import com.espere.car.repository.AppointmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AppointmentService {

    private AppointmentRepository appointmentRepository;

    public List getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Optional getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    public Appointment saveAppointment(Appointment appointment) {
        return (Appointment) appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    public Optional<Appointment> updateAppointmentStatus(Long id, String status) {
        Optional<Appointment> appointmentOptional = appointmentRepository.findById(id);
        if (appointmentOptional.isPresent()) {
            Appointment appointment = appointmentOptional.get();
            appointment.setStatus(status);
            return Optional.of((Appointment) appointmentRepository.save(appointment));
        }
        return Optional.empty();
    }
}


