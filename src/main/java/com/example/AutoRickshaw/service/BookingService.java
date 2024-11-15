package com.example.AutoRickshaw.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutoRickshaw.entity.Booking;
import com.example.AutoRickshaw.entity.Rickshaw;
import com.example.AutoRickshaw.entity.User;
import com.example.AutoRickshaw.repository.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RickshawService rickshawService;

    public Booking bookRickshaw(Long userId, Long rickshawId, String pickup, String dropoff, Double fare) {
        // Fetch and update the rickshaw's availability
        Rickshaw rickshaw = rickshawService.updateAvailability(rickshawId, false);
        if (rickshaw == null) {
            throw new IllegalStateException("Rickshaw not available");
        }

        // Create a new booking
        Booking booking = new Booking();
        booking.setBookingTime(LocalDateTime.now());
        booking.setPickupLocation(pickup);
        booking.setDropoffLocation(dropoff);
        booking.setFare(fare);
        booking.setRickshaw(rickshaw);

        // Set user (ensure the User entity has a constructor for setting ID)
        User user = new User(userId);
        booking.setUser(user);

        // Save and return the booking
        return bookingRepository.save(booking);
    }
}
