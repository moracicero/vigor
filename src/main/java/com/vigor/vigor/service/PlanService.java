package com.vigor.vigor.service;

import com.vigor.vigor.model.Plan;
import com.vigor.vigor.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public List<Plan> listarPlanes() {
        return planRepository.findAllByOrderByDestacadoDescPrecioUsdAsc();
    }
}