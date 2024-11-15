package com.example.AutoRickshaw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AutoRickshaw.entity.Booking;
import com.example.AutoRickshaw.entity.Rickshaw;
import com.example.AutoRickshaw.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/rickshaws")
    public List<Rickshaw> getAllRickshaws() {
        return adminService.viewAllRickshaws();
    }

    @PostMapping("/rickshaw")
    public Rickshaw addRickshaw(@RequestBody Rickshaw rickshaw) {
        return adminService.addRickshaw(rickshaw);
    }

    @PutMapping("/rickshaw/{id}")
    public Rickshaw updateRickshaw(@PathVariable Long id, @RequestBody Rickshaw rickshaw) {
        return adminService.updateRickshaw(id, rickshaw);
    }

    @DeleteMapping("/rickshaw/{id}")
    public ResponseEntity<String> deleteRickshaw(@PathVariable Long id) {
        adminService.deleteRickshaw(id);
        return ResponseEntity.ok("Rickshaw deleted successfully");
    }

    @GetMapping("/bookings")
    public List<Booking> getBookings(@RequestParam(required = false) String sortBy) {
        return adminService.viewBookings(sortBy);
    }
}
