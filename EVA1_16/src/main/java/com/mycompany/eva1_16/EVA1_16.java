/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_16 {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        int km,meses;
        System.out.println("Cuanto kilometros tiene el vehiculo?");
        km = ver.nextInt();
        ver.nextLine();
        System.out.println("Cuantos meses tiene el vehiculo?");
        meses = ver.nextInt();
        ver.nextLine();
        
        if(km >=5000 || meses >= 6)
            System.out.println("Ya tienes que hacerle un cambio de aceite");
        else
            System.out.println("Tu carro va bien");
    }
}
