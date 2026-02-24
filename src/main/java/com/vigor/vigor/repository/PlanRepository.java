package com.vigor.vigor.repository;

import com.vigor.vigor.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Long> {
    List<Plan> findAllByOrderByDestacadoDescPrecioUsdAsc();
}

