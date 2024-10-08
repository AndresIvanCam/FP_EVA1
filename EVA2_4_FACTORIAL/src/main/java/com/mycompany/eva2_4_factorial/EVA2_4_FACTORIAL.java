/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
        int base, resu = 1;
        Scanner ver = new Scanner(System.in);
        System.out.println("Base: ");
        base = ver.nextInt();
        ver.nextLine();
        for (int i = 1; i <= base; i++) {
            resu *= i;
        }
        System.out.println("El resultado es = " + resu);
    }
}
