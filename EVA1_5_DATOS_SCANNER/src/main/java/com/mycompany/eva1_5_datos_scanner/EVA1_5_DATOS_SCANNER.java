/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_datos_scanner;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_5_DATOS_SCANNER {

    public static void main(String[] args) {
        String marca;
        String modelo;
        int año;
        double precio;
        //Ahora se utilizara el Scanner
        Scanner ver = new Scanner(System.in);
        
        //Ahora preguntamos el usuario y el contestara 
        
        System.out.println("¿Que  marca de carro es?");
        marca = ver.nextLine();
        System.out.println("¿Que modelo de carro es?");
        modelo = ver.nextLine();
        System.out.println("¿Que años es el carro?");
        año = ver.nextInt();
        System.out.println("¿Que precio tiene el carro?");
        precio = ver.nextDouble();
        
        //Ahora vamos a imprimir lo que pusieron
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        System.out.println(precio);
    }
}
