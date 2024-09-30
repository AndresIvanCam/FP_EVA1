/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_if_else_anidad;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_18_IF_ELSE_ANIDAD {

    public static void main(String[] args) {
        int dia;
        Scanner ver = new Scanner(System.in);
        System.out.println("Numero correspodiente al dia (1-7)");
        dia = ver.nextInt();
        
        if(dia == 1)
            System.out.println("Lunes");
        else if(dia == 2)
            System.out.println("Martes");
        else if(dia == 3)
            System.out.println("Miercoles");
        else if(dia == 4)
            System.out.println("Jueves");
        else if(dia == 5)
            System.out.println("Viernes");
        else if(dia == 6)
            System.out.println("Sabado");
        else if(dia == 7)
            System.out.println("Domingo");
        else
            System.out.println("No es un dia valido de la semana");
    }
}
