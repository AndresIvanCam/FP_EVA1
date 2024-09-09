/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_10 {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        double d, Vo, t, a;
        
        //como sacar la distancia
        System.out.println("pon lo siguientes valores para sacar la distancia: ");
        System.out.println("Velocidad Inicial: ");
        Vo = ver.nextDouble();
        System.out.println("Tiempo: ");
        t = ver.nextDouble();
        System.out.println("Aceleracion: ");
        a = ver.nextDouble();
        d = Vo * t + (a * t * t) / 2;
        System.out.println("Distancia = " + d);
    }
}
