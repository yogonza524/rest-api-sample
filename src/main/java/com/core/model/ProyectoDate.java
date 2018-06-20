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
public class ProyectoDate {
    
    private String date;
    private Integer timezone_type;
    private String timezone;
    
    private int numero;

    public ProyectoDate() {
        
    }

    public ProyectoDate(String date, Integer timezone_type, String timezone, int numero) {
        this.date = date;
        this.timezone_type = timezone_type;
        this.timezone = timezone;
        this.numero = numero;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimezone_type() {
        return timezone_type;
    }

    public void setTimezone_type(Integer timezone_type) {
        this.timezone_type = timezone_type;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.date);
        hash = 59 * hash + Objects.hashCode(this.timezone_type);
        hash = 59 * hash + Objects.hashCode(this.timezone);
        hash = 59 * hash + this.numero;
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
        final ProyectoDate other = (ProyectoDate) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.timezone, other.timezone)) {
            return false;
        }
        if (!Objects.equals(this.timezone_type, other.timezone_type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyectoDate{" + "date=" + date + ", timezone_type=" + timezone_type + ", timezone=" + timezone + ", numero=" + numero + '}';
    }
    
    
    
}
