/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apicoleccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Alumno Mañana
 */
public class ApiColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nARRAYLIST");
        List arrDias = new ArrayList();
        arrDias.add("Lunes");
        arrDias.add("Martes");
        arrDias.add("Miercoles");
        arrDias.add("Jueves");
        arrDias.add("Viernes");
        arrDias.add("Sabado");
        arrDias.add("Domingo");
        
        for(Object semana: arrDias){
            System.out.println("Semana: " + semana);
        }
        
        System.out.println("\nHASHSET:"); 
        Set setDias = new HashSet();
        setDias.add("Lunes");
        setDias.add("Martes");
        setDias.add("Miercoles");
        setDias.add("Jueves");
        setDias.add("Viernes");
        setDias.add("Sabado");
        setDias.add("Domingo");
        
        System.out.println("IMPRIMIENDO MI LISTA:");
        imprimir(arrDias);
        System.out.println("IMPRIMIENDO MI SET:");
        imprimir(setDias);
        
        System.out.println("");
        
        Map mapNombres = new HashMap<>();
        mapNombres.put("Alberto", "Perez");
        mapNombres.put("Miguel", "Caro");
        mapNombres.put("Sergio", "Lopez");
        
        String elem = (String) mapNombres.get("Alberto");
        System.out.println("MAP:");
        System.out.println("elem = " + elem);
        System.out.println("IMPRIMIR TODO EL MAP:");
        imprimir(mapNombres.keySet());
        System.out.println("IMPRIMIR LOS VALORES DEL MAP:");
        imprimir(mapNombres.values());
        
        
        
    }
    
    public static void imprimir(Collection coleccion){
        
        coleccion.forEach(elem -> {
            System.out.println("elem = " + elem);
        });
        
    }
    
}
