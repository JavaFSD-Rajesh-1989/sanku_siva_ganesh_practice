package com.example.AutoRickshaw.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.AutoRickshaw.entity.Booking;
import com.example.AutoRickshaw.entity.Rickshaw;
import com.example.AutoRickshaw.repository.BookingRepository;
import com.example.AutoRickshaw.repository.RickshawRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AdminService {
    @Autowired
    private RickshawRepository rickshawRepository;

    @Autowired
    private BookingRepository bookingRepository;

    public List<Rickshaw> viewAllRickshaws() {
        return rickshawRepository.findAll();
    }

    public Rickshaw addRickshaw(Rickshaw rickshaw) {
        return rickshawRepository.save(rickshaw);
    }

    public Rickshaw updateRickshaw(Long id, Rickshaw updatedRickshaw) {
        Rickshaw rickshaw = rickshawRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Rickshaw not found"));
        rickshaw.setLocation(updatedRickshaw.getLocation());
        rickshaw.setVehicleType(updatedRickshaw.getVehicleType());
        rickshaw.setFare(updatedRickshaw.getFare());
        rickshaw.setRating(updatedRickshaw.getRating());
        rickshaw.setAvailable(updatedRickshaw.isAvailable());
        return rickshawRepository.save(rickshaw);
    }

    public void deleteRickshaw(Long id) {
        rickshawRepository.deleteById(id);
    }

    public List<Booking> viewBookings(String sortBy) {
        if (sortBy.equals("date")) {
            return bookingRepository.findAll(Sort.by(Sort.Direction.ASC, "bookingTime"));
        } else if (sortBy.equals("fare")) {
            return bookingRepository.findAll(Sort.by(Sort.Direction.ASC, "fare"));
        } else if (sortBy.equals("status")) {
           
            return bookingRepository.findAll(Sort.by(Sort.Direction.ASC, "status"));
        }
        return bookingRepository.findAll();
    }
}
