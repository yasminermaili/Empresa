/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author daw
 */
public class Principal {
    public static void main(String[] args) {
        Trabajador t1 = (new TrabajadorParcial("Pepe",8,7));
        Trabajador t2 = (new TrabajadorParcial("Juan",2,13));
        Trabajador t3 = (new TrabajadorIndefinido("Alvaro", 3,8,'C'));
        Trabajador t4 = (new TrabajadorIndefinido("Lopez", 1,12,'A'));
        ArrayList<Trabajador> lista=new ArrayList<>();
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        
        for (Trabajador t : lista) {
            if (t instanceof TrabajadorParcial) {
                TrabajadorParcial tp=(TrabajadorParcial) t;
                System.out.println(tp);
                System.out.println("El salario del Trabajador Parcial "+tp.getNombre()+" es "+tp.calcularSalario(15));
            }else if(t instanceof TrabajadorIndefinido){
                TrabajadorIndefinido ti = (TrabajadorIndefinido) t;
                System.out.println(ti);
                System.out.println("el salario del Trabajador Indefinido "+ti.getNombre()+" es "+ti.calcularSalario(30));
                System.out.println("numero de dias de vacaciones "+ti.vacaciones());
            }
            

        }
        
         System.out.println("-------lista de trabajadores Ordenada por nombre--------");
         Collections.sort(lista);
         System.out.println(lista);
         
         
          System.out.println("-------lista de trabajadores Ordenada por id--------");
          Collections.sort(lista, new OrdenarPorIdTrabajador());
          System.out.println(lista);
        
      
    }
}
