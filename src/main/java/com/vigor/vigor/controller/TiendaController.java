package com.vigor.vigor.controller;

import com.vigor.vigor.service.PlanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TiendaController {

    private final PlanService planService;

    public TiendaController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/tienda")
    public String tienda(Model model) {
        model.addAttribute("planes", planService.listarPlanes());
        return "tienda";
    }
}