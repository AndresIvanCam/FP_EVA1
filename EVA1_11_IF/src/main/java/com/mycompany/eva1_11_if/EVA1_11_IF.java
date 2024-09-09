/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
        //Logica booleana --> operaciones de verdad o falso
        //Solicitar la edad en años
        Scanner ver = new Scanner(System.in);
        int edad;
        System.out.println("¿Cuantos años tienes ?");
        edad = ver.nextInt();
        //Determinar si es un adulto o no 
        //Las operaciones logicas solo generan como resultado un verdadero o falso
        //si son varias instrucciones, ha quue agruparlas en llaves {}
        if(edad >= 18)  //Bloque de verdadero
            System.out.println("Es un adulto");
        else            //Bloque de falso (opcional)
            System.out.println("Menor de edad");
    }
}
