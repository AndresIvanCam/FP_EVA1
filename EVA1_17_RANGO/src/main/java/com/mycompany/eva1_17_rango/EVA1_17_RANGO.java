/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
        int Cali;
        Scanner ver = new Scanner(System.in);
        System.out.println("pon tu calificacion");
        Cali = ver.nextInt();
        ver.nextLine();
        if(Cali <=100 && Cali >= 0)
            System.out.println("Valida");
        else
            System.out.println("Invalida");
        System.out.println("Ahora veremos si pasastes o no");
        if(Cali >= 70)
            System.out.println("Aprobastes");
        else
            System.out.println("Suerte para la proxima");
    }
}
