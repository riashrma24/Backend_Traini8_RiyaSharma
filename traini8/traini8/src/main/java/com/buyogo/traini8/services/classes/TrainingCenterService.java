package com.buyogo.traini8.services.classes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buyogo.traini8.entities.TrainingCenter;
import com.buyogo.traini8.repositories.TrainingCenterRepository;

import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

 
    @Transactional
    public TrainingCenter addTrainingCenter(TrainingCenter trainingCenter) {
    	System.out.println("Req in services");
        return trainingCenterRepository.save(trainingCenter);
    }

 
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
