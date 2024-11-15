package com.example.AutoRickshaw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AutoRickshaw.entity.Rickshaw;
import com.example.AutoRickshaw.service.RickshawService;

@RestController
@RequestMapping("/api/rickshaws")
public class RickshawController {
    @Autowired
    private RickshawService rickshawService;

    @GetMapping("/search")
    public List<Rickshaw> searchRickshaws(@RequestParam String location,
                                          @RequestParam Double minFare,
                                          @RequestParam Double maxFare) {
        return rickshawService.searchRickshaws(location, minFare, maxFare);
    }
}

