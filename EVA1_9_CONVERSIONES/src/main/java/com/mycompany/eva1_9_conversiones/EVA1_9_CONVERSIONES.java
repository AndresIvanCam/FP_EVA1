/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_9_CONVERSIONES {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        double far, cent, kelv;
        System.out.println("Temperaturas Celsius en grados Farenheit: ");
        far = ver.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("°C = "+cent);
        
        System.out.println("Temperaturas Farenheit en grados Celsius: ");
        cent = ver.nextDouble();
        far = (cent * 1.8) + 32;
        System.out.println("°F = "+far);
        
        //kelvin
        System.out.println("Temperaturas Farenheit en grados Kelvin: ");
        far = ver.nextDouble();
        kelv = (far -32) * 5 / 9 + 273.15;
        System.out.println("°K = "+kelv);
    }
}
