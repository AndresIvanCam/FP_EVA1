/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int base, expo, resu = 1;
        Scanner ver = new Scanner(System.in);
        System.out.println("Base: ");
        base = ver.nextInt();
        ver.nextLine();
        System.out.println("Exponente: ");
        expo = ver.nextInt();
        ver.nextLine();
        for (int i = 1; i <= expo; i++) {
            resu *= base;
        }
        int resu1 =+ resu;
        System.out.println("El resultado es = " + resu1);
    }
}
