package com.vigor.vigor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Entity
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    @Email
    private String email;

    // START / INTERMEDIATE / PRO / ELITE
    @NotBlank
    private String planCodigo;

    @Column(length = 2000)
    @NotBlank
    private String mensaje;

    private LocalDateTime creadaEn;

    @PrePersist
    public void prePersist() {
        this.creadaEn = LocalDateTime.now();
    }

    public Solicitud() {}

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPlanCodigo() { return planCodigo; }
    public void setPlanCodigo(String planCodigo) { this.planCodigo = planCodigo; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    public LocalDateTime getCreadaEn() { return creadaEn; }
}