/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_19_MESES {

    public static void main(String[] args) {
        int MES;
        Scanner ver = new Scanner(System.in);
        System.out.println("Numero correspondiente al mes(1-12)");
        MES = ver.nextInt();
        
        if(MES == 1)
            System.out.println("Enero");
        else if(MES == 2)
            System.out.println("Febrero");
        else if(MES == 3)
            System.out.println("Marzo");
        else if(MES == 4)
            System.out.println("Abril");
        else if(MES == 5)
            System.out.println("Mayo");
        else if(MES == 6)
            System.out.println("Junio");
        else if(MES == 7)
            System.out.println("Julio");
        else if(MES == 8)
            System.out.println("Agosto");
        else if(MES == 9)
            System.out.println("Septiembre");
        else if(MES == 10)
            System.out.println("Octubre");
        else if(MES == 11)
            System.out.println("Nombiembre");
        else if(MES == 12)
            System.out.println("Diciembre");
        else
            System.out.println("No existes es numero de mes");
            
    }
}
