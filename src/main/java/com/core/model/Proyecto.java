/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.model;

import java.util.Objects;

/**
 *
 * @author gonzalo
 */
public class Proyecto {
    
    private Integer id;
    private String nombreProyecto;
    private ProyectoDate startDate;
    private ProyectoDate endDate;
    private String imagen;
    private String objetivo;

    public Proyecto() {
    }

    public Proyecto(Integer id, String nombreProyecto, ProyectoDate startDate, ProyectoDate endDate, String imagen, String objetivo) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imagen = imagen;
        this.objetivo = objetivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public ProyectoDate getStartDate() {
        return startDate;
    }

    public void setStartDate(ProyectoDate startDate) {
        this.startDate = startDate;
    }

    public ProyectoDate getEndDate() {
        return endDate;
    }

    public void setEndDate(ProyectoDate endDate) {
        this.endDate = endDate;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.nombreProyecto);
        hash = 11 * hash + Objects.hashCode(this.startDate);
        hash = 11 * hash + Objects.hashCode(this.endDate);
        hash = 11 * hash + Objects.hashCode(this.imagen);
        hash = 11 * hash + Objects.hashCode(this.objetivo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proyecto other = (Proyecto) obj;
        if (!Objects.equals(this.nombreProyecto, other.nombreProyecto)) {
            return false;
        }
        if (!Objects.equals(this.imagen, other.imagen)) {
            return false;
        }
        if (!Objects.equals(this.objetivo, other.objetivo)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        return true;
    }
    
    
}
