package com.example.AutoRickshaw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AutoRickshaw.entity.Booking;
import com.example.AutoRickshaw.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public Booking bookRickshaw(@RequestParam Long userId,
                                 @RequestParam Long rickshawId,
                                 @RequestParam String pickupLocation,
                                 @RequestParam String dropoffLocation,
                                 @RequestParam Double fare) {
        return bookingService.bookRickshaw(userId, rickshawId, pickupLocation, dropoffLocation, fare);
    }
}
