package com.example.AutoRickshaw.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AutoRickshaw.entity.Rickshaw;

public interface RickshawRepository extends JpaRepository<Rickshaw, Long> {
    List<Rickshaw> findByLocationAndAvailableTrue(String location);
    List<Rickshaw> findByFareBetween(Double minFare, Double maxFare);
}

