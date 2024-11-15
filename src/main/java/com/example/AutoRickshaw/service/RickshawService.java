package com.example.AutoRickshaw.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutoRickshaw.entity.Rickshaw;
import com.example.AutoRickshaw.repository.RickshawRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RickshawService {
    @Autowired
    private RickshawRepository rickshawRepository;

    public List<Rickshaw> searchRickshaws(String location, Double minFare, Double maxFare) {
        List<Rickshaw> rickshaws = rickshawRepository.findByLocationAndAvailableTrue(location);
        return rickshaws.stream()
                        .filter(r -> r.getFare() >= minFare && r.getFare() <= maxFare)
                        .collect(Collectors.toList());
    }

    public Rickshaw updateAvailability(Long rickshawId, boolean availability) {
        Rickshaw rickshaw = rickshawRepository.findById(rickshawId)
                                              .orElseThrow(() -> new EntityNotFoundException("Rickshaw not found"));
        rickshaw.setAvailable(availability);
        return rickshawRepository.save(rickshaw);
    }
}
