package com.vigor.vigor.controller;

import com.vigor.vigor.model.Solicitud;
import com.vigor.vigor.service.PlanService;
import com.vigor.vigor.service.SolicitudService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactoController {

    private final PlanService planService;
    private final SolicitudService solicitudService;

    public ContactoController(PlanService planService, SolicitudService solicitudService) {
        this.planService = planService;
        this.solicitudService = solicitudService;
    }

    @GetMapping("/contacto")
    public String contacto(@RequestParam(value = "plan", required = false) String planCodigo,
                           Model model) {
        Solicitud form = new Solicitud();
        if (planCodigo != null && !planCodigo.isBlank()) {
            form.setPlanCodigo(planCodigo);
        } else {
            form.setPlanCodigo("INTERMEDIATE"); // default piola
        }

        model.addAttribute("solicitud", form);
        model.addAttribute("planes", planService.listarPlanes());
        return "contacto";
    }

    @PostMapping("/contacto")
    public String enviar(@Valid @ModelAttribute("solicitud") Solicitud solicitud,
                         BindingResult bindingResult,
                         Model model) {

        // Si hay errores, volvemos a mostrar la página con la lista de planes
        if (bindingResult.hasErrors()) {
            model.addAttribute("planes", planService.listarPlanes());
            return "contacto";
        }

        solicitudService.guardar(solicitud);

        // Redirigimos con flag de ok
        return "redirect:/contacto?ok=1&plan=" + solicitud.getPlanCodigo();
    }
}