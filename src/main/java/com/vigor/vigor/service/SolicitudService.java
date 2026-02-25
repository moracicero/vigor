package com.vigor.vigor.service;

import com.vigor.vigor.model.Solicitud;
import com.vigor.vigor.repository.SolicitudRepository;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService {

    private final SolicitudRepository solicitudRepository;

    public SolicitudService(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }

    public Solicitud guardar(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }
}