/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modeloexamen3;

import java.util.Calendar;

/**
 *
 * @author Pablo
 */
public class Vendedor {
    
    private String nombre, apellido;
    private float sueldo_basico, porcentaje_comision, año_contratacion;
    
public Vendedor()
{
    nombre = "";
    apellido = "";
    año_contratacion = 0.0f;
    sueldo_basico = 0.0f;
    porcentaje_comision = 0.0f;
    
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getAño_contratacion() {
        return año_contratacion;
    }

    public void setAño_contratacion(float año_contratacion) {
        this.año_contratacion = año_contratacion;
    }

    public float getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(float sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }

    public float getPorcentaje_comision() {
        return porcentaje_comision;
    }

    public void setPorcentaje_comision(float porcentaje_comision) {
        this.porcentaje_comision = porcentaje_comision;
    }
    
public float calcularAntiguedad()
{
    float antiguedad;
    Calendar calendario;
    calendario = Calendar.getInstance();
    antiguedad = calendario.get(Calendar.YEAR) - año_contratacion;
    
    return antiguedad;
}

public float calcularSueldoNeto(float ventas)
{
    float sueldo_neto;
    float descuento = sueldo_basico * 0.18f;
    float comision = ventas * porcentaje_comision/100;
    sueldo_neto = sueldo_basico - descuento + comision;
 
    if (calcularAntiguedad () >= 10)
        sueldo_neto = sueldo_neto+5000;
  
    return sueldo_neto;
}
    



}