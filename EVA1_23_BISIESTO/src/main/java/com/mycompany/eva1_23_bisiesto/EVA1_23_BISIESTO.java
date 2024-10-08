/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_23_BISIESTO {

    public static void main(String[] args) {
        int year;
        Scanner ver = new Scanner(System.in);
        System.out.println("pon tu año");
        year = ver.nextInt();
        ver.nextLine();
        
        int modulo4 = year % 4;
        if(modulo4 == 0){
            int modulo100 = year % 100;
            if (modulo100 != 0) {
                System.out.println("ES año Bisiesto");
            }
            else{
                int modulo400 = year % 400;
                if(modulo400 == 0){
                    System.out.println("es bisiesto");
                }
                else
                    System.out.println("no es bisiesto");
            }
        }
        else
            System.out.println("no es bisiesto");
    }
}
