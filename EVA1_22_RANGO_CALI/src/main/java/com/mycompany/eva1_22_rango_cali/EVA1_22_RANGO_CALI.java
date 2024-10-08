/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_rango_cali;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_22_RANGO_CALI {

    public static void main(String[] args) {
        int cali;
        Scanner ver = new Scanner(System.in);
        System.out.println("Pon tu calificacion");
        cali = ver.nextInt();
        ver.nextLine();
        
        if(cali < 0)
            System.out.println("Esta incorrecto la calificacion");
        else if(cali < 59)
            System.out.println("F");
        else if(cali < 60)
            System.out.println("E");
        else if(cali < 70)
            System.out.println("D");
        else if(cali< 80)
            System.out.println("C");
        else if(cali < 90)
            System.out.println("B");
        else if(cali <= 100)
            System.out.println("A");
        else
            System.out.println("Reprobado");
    }
}
