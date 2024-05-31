/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

/**
 *
 * @author daw
 */
public class TrabajadorParcial extends Trabajador{
    private int duracion;

    public TrabajadorParcial(String nombre, long id , int duracion) {
        super(nombre, id);
        this.duracion=duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public double calcularSalario(int dias) {
        double salario_final=Trabajador.getSalario()*dias;
        if (this.duracion>=3 && this.duracion<6) {
            salario_final+= salario_final+80;
        }else if(this.duracion>=7 && this.duracion<12){
            salario_final+= salario_final+110;
        }else if(this.duracion>12){
             salario_final+= salario_final*1.25;
        }
        return salario_final;
    }

    @Override
    public String toString() {
        return "TrabajadorParcial{ " +super.toString()+ " duracion del contrato " + duracion + " meses}";
    }
    
    
    
}
