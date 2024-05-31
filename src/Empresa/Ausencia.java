/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.time.LocalDate;

/**
 *
 * @author daw
 */
public final class Ausencia {
    private LocalDate fecha;
    private int num_dias;

    public Ausencia(LocalDate fecha, int num_dias) {
        this.fecha = fecha;
        this.num_dias = num_dias;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNum_dias() {
        return num_dias;
    }

    public void setNum_dias(int num_dias) {
        this.num_dias = num_dias;
    }

    @Override
    public String toString() {
        return "Ausencia{" + "fecha=" + fecha + ", num_dias=" + num_dias + '}';
    }

   
}
