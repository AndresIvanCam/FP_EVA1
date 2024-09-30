/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_switch_meses;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_21_SWITCH_MESES {

    public static void main(String[] args) {
        int MES;
        Scanner ver = new Scanner(System.in);
        System.out.println("numero de mese de (1-12)");
        MES = ver.nextInt();
        
        switch(MES){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Nombriembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No esta ese numero de mes");
        }
    }
}
