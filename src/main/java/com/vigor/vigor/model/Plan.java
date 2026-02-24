package com.vigor.vigor.model;

import jakarta.persistence.*;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    // START / INTERMEDIATE / PRO / ELITE
    @Column(nullable = false)
    private String codigo;

    // null para ELITE si querés “a consultar”
    private Integer precioUsd;

    // 6, 8, 12, etc. null para ELITE
    private Integer duracionSemanas;

    @Column(length = 1200)
    private String descripcion;

    // bullets separados por |
    @Column(length = 2000)
    private String incluye;

    // objetivos separados por | (solo para start/intermediate)
    @Column(length = 400)
    private String objetivos;

    @Column(nullable = false)
    private Boolean destacado = false;

    @Column(length = 200)
    private String ctaTexto;

    @Column(length = 400)
    private String ctaUrl;

    public Plan() {}

    // Getters/Setters (mínimos)
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Integer getPrecioUsd() { return precioUsd; }
    public void setPrecioUsd(Integer precioUsd) { this.precioUsd = precioUsd; }
    public Integer getDuracionSemanas() { return duracionSemanas; }
    public void setDuracionSemanas(Integer duracionSemanas) { this.duracionSemanas = duracionSemanas; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getIncluye() { return incluye; }
    public void setIncluye(String incluye) { this.incluye = incluye; }
    public String getObjetivos() { return objetivos; }
    public void setObjetivos(String objetivos) { this.objetivos = objetivos; }
    public Boolean getDestacado() { return destacado; }
    public void setDestacado(Boolean destacado) { this.destacado = destacado; }
    public String getCtaTexto() { return ctaTexto; }
    public void setCtaTexto(String ctaTexto) { this.ctaTexto = ctaTexto; }
    public String getCtaUrl() { return ctaUrl; }
    public void setCtaUrl(String ctaUrl) { this.ctaUrl = ctaUrl; }
}