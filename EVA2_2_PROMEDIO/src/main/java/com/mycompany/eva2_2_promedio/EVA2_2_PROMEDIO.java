/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        int califa, Prom = 0;
        Scanner ver = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Estudiante #" + i);
            System.out.println("Cual es tu calificacion");
            califa = ver.nextInt();
            ver.nextLine();
            Prom = califa + Prom;
        }
        System.out.println("La suma total = " + Prom);
        double res = Prom / 10.0;
        System.out.println("El promedio es = " + res);
    }
}
