package org.marco.planets.model;

import java.io.Serializable;

public class Planet implements Serializable{
    private int id;
    private String nombrePlaneta;
    private String imagen;
    private String simbolo;
    private double inclinacionOrbital;
    private double inclinacionAxial;
    private double periodoOrbitalSideral;
    private double periodoOrbitalSidonico;
    private double velocidadOrbital;
    private double distanciaSol;
    private double afelio;
    private double perihelio;
    private double diametro;
    private double circunferencia;
    private double superficieKm;
    private double relacionSuperficieTierra;
    private String volumen;
    private String masa;
    private double satelitesNaturales;
    private double velocidadEscape;
    private double albedo;
    private int dias;
    private int años;
    private String proxCumpleaños;
    private String created_at;
    private String updated_at;


    // Getter y Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePlaneta() {
        return nombrePlaneta;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta = nombrePlaneta;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getInclinacionOrbital() {
        return inclinacionOrbital;
    }

    public void setInclinacionOrbital(double inclinacionOrbital) {
        this.inclinacionOrbital = inclinacionOrbital;
    }

    public double getInclinacionAxial() {
        return inclinacionAxial;
    }

    public void setInclinacionAxial(double inclinacionAxial) {
        this.inclinacionAxial = inclinacionAxial;
    }

    public double getPeriodoOrbitalSideral() {
        return periodoOrbitalSideral;
    }

    public void setPeriodoOrbitalSideral(double periodoOrbitalSideral) {
        this.periodoOrbitalSideral = periodoOrbitalSideral;
    }

    public double getPeriodoOrbitalSidonico() {
        return periodoOrbitalSidonico;
    }

    public void setPeriodoOrbitalSidonico(double periodoOrbitalSidonico) {
        this.periodoOrbitalSidonico = periodoOrbitalSidonico;
    }

    public double getVelocidadOrbital() {
        return velocidadOrbital;
    }

    public void setVelocidadOrbital(double velocidadOrbital) {
        this.velocidadOrbital = velocidadOrbital;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getAfelio() {
        return afelio;
    }

    public void setAfelio(double afelio) {
        this.afelio = afelio;
    }

    public double getPerihelio() {
        return perihelio;
    }

    public void setPerihelio(double perihelio) {
        this.perihelio = perihelio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getSuperficieKm() {
        return superficieKm;
    }

    public void setSuperficieKm(double superficieKm) {
        this.superficieKm = superficieKm;
    }

    public double getRelacionSuperficieTierra() {
        return relacionSuperficieTierra;
    }

    public void setRelacionSuperficieTierra(double relacionSuperficieTierra) {
        this.relacionSuperficieTierra = relacionSuperficieTierra;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public double getSatelitesNaturales() {
        return satelitesNaturales;
    }

    public void setSatelitesNaturales(double satelitesNaturales) {
        this.satelitesNaturales = satelitesNaturales;
    }

    public double getVelocidadEscape() {
        return velocidadEscape;
    }

    public void setVelocidadEscape(double velocidadEscape) {
        this.velocidadEscape = velocidadEscape;
    }

    public double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getProxCumpleaños() {
        return proxCumpleaños;
    }

    public void setProxCumpleaños(String proxCumpleaños) {
        this.proxCumpleaños = proxCumpleaños;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return nombrePlaneta;
    }
}
