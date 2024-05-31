/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daw
 */
public abstract class Trabajador implements Comparable<Trabajador>{
    private final String nombre;
    private long id;
    private List<Ausencia> ausencias;
    private final static double salario=800.0;

    public Trabajador(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
        ausencias= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public static double getSalario() {
        return salario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ausencia> getAusencias() {
        List<Ausencia> copia=new ArrayList<>();
        for (Ausencia a : ausencias) {
            copia.add(new Ausencia(a.getFecha(),a.getNum_dias()));
        }
        return copia;
    }
    
    public void pedirPermiso(LocalDate fecha , int num_dias){
        this.ausencias.add(new Ausencia(fecha,num_dias));
    }
    
     public void pedirPermiso(LocalDate fecha){
        this.ausencias.add(new Ausencia(fecha,1));
    }
    public abstract double calcularSalario(int dias) ;

    @Override
    public String toString() {
        return "nombre " + nombre + ", id " + id + ", ausencias " + ausencias + ' ';
    }

    @Override
    public int compareTo(Trabajador o) {
        
        return this.nombre.compareTo(o.getNombre());
        
    }
    
    
    
}
