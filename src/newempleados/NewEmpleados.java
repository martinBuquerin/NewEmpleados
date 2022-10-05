/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newempleados;

import Dominio.Persona;

/**
 *
 * @author Martín
 */
public class NewEmpleados {

        
    
    
    public static void main(String[] args) {
        Persona arrayEmpl[] = new Persona[3];
       
        Persona per1 = new Persona("martin","buquerin");
        Persona per2 = new Persona("juian","loco");
        Persona per3 = new Persona("han","solo");
        
        Integer numeros []= new Integer [3];

        arrayEmpl[0] = per1;
        arrayEmpl[1] = per2;
        arrayEmpl[2] = per3;
        
        
        for (int i = 0; i < 3; i++) {
            numeros[i]=alea(0,9);
    }
    
        
        imprimir(arrayEmpl);
        imprimir(numeros);
    }
    
     public static void imprimir(Object nombre[]){
        for (int i = 0; i < nombre.length; i++) {
            System.out.print(nombre[i]+"\n");
        }
    }
   
    public static int alea(int li, int ls){
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
      
}
    

