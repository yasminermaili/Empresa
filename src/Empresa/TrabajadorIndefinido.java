/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class TrabajadorIndefinido extends Trabajador implements Extras{
    private int antigüedad ;
    private char categoria;

    public TrabajadorIndefinido(String nombre, long id,int antigüedad,char categoria) {
        super(nombre, id);
        this.antigüedad=antigüedad;
        this.categoria=categoria;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    

    @Override
    public double calcularSalario(int dias) {
       double plus=Trabajador.getSalario()*dias;
        switch (categoria) {
            case 'A' -> plus+= plus*0.1;
            case 'B' -> plus+= plus*0.15;
            case 'C' -> plus+= plus*0.2;    
        }
        return plus;
    }

    @Override
    public int vacaciones() {
        int dias_ausentado=0;
        ArrayList<Ausencia> ausencias= (ArrayList<Ausencia>) this.getAusencias();
        for (Ausencia ausencia : ausencias) {
            dias_ausentado+=ausencia.getNum_dias();
        }
        return Extras.constante_vac-dias_ausentado;
    }

    @Override
    public String toString() {
        return "TrabajadorIndefinido{ " +super.toString()+ " antigüedad " + antigüedad + ", categoria " + categoria + '}';
    }
    
    
}
