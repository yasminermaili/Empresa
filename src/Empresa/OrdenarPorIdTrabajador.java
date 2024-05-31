/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empresa;

import java.util.Comparator;

/**
 *
 * @author daw
 */
public class OrdenarPorIdTrabajador implements Comparator<Trabajador>{

    @Override
    public int compare(Trabajador o1, Trabajador o2) {
        if(o1.getId()< o2.getId()){
            return -1;
        }else if(o1.getId()>o2.getId()){
            return 1;
        }
        return 0;
    }
    
}
