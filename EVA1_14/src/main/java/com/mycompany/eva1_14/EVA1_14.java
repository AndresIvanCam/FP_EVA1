/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_14 {

    public static void main(String[] args) {
        char tipo;
        Scanner ver = new Scanner(System.in);
        tipo = ver.nextLine().charAt(0);
        System.out.println("El Caracter es "+tipo);
        if (tipo == 'F')
            System.out.println("Persona fisica");
        else
            System.out.println("Persona moral");
    }
}
