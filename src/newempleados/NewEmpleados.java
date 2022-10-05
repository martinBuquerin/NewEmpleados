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
        Persona arrayEmpl[] = new Persona[3];//nueva array de tipo Persona
       
        Persona per1 = new Persona("martin","buquerin");//creacion de objeto persona
        Persona per2 = new Persona("juian","loco");
        Persona per3 = new Persona("han","solo");
        
        Integer numeros []= new Integer [3];//creacion de array tipo Int

        arrayEmpl[0] = per1;//asignacion de objeto persona al array  de tipo persona
        arrayEmpl[1] = per2;
        arrayEmpl[2] = per3;
        
        
        for (int i = 0; i < 3; i++) {//loop para completar automaticamente el array de tipo int de forma aleatoria
            numeros[i]=alea(0,9);
    }
    
        
        imprimir(arrayEmpl);// usando la funcion imprimir con el array tipo persona
        imprimir(numeros);// usando la funcion imprimir con el array tipo int
    }
    
     public static void imprimir(Object nombre[]){//funcion para imprimir cualquier array 
        for (int i = 0; i < nombre.length; i++) {
            System.out.print(nombre[i]+"\n");
        }
    }
   
    public static int alea(int li, int ls){//funcion que devuelve numeros aleatorios
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
      
}
    

