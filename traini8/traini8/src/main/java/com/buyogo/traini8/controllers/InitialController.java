package com.buyogo.traini8.controllers;

import jakarta.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.buyogo.traini8.entities.TrainingCenter;
import com.buyogo.traini8.services.classes.TrainingCenterService;

import java.util.List;

@RestController
@Validated
@RequestMapping("/api")
public class InitialController {

    private final TrainingCenterService trainingCenterService;

    public InitialController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }

    @PostMapping("/trainingCenters")
    public TrainingCenter createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
    	System.out.println("Req in controller arrived");
        return trainingCenterService.addTrainingCenter(trainingCenter);
    }

    @GetMapping("/trainingCenters")
    public List<TrainingCenter> getAllTrainingCenters() {
    	System.out.println("Req in controller");
        return trainingCenterService.getAllTrainingCenters();
    }
}
