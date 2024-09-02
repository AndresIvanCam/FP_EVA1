/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasifi;
        
        System.out.println("¿Que nombre tiene la pelicula?");
        Nombre = ver.nextLine();
        System.out.println("¿Que genero tiene la pelicula?");
        Genero = ver.nextLine();
        System.out.println("¿Cual es la duracion de la pelicula?");
        Duracion = ver.nextInt();
        System.out.println("¿Quien es el que hace el reparto de la pelicula");
        Reparto = ver.nextLine();
        System.out.println("¿Cual es la clasificacion de la pelicula");
        Clasifi = ver.nextLine();
        
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(Reparto);
        System.out.println(Clasifi);
    }
}
