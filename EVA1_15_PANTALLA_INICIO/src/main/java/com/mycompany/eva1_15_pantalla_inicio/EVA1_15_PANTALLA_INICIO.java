/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA1_15_PANTALLA_INICIO {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        final String Usuario = "Admin", Contra = "Hola";
        
        String US,CO;
        System.out.println("Usuario");
        US = ver.nextLine();
        System.out.println("Contraseña");
        CO = ver.nextLine();
        
        if (Usuario.equals(US) && Contra.equals(CO))
            System.out.println("Acceso permitido");
        else
            System.out.println("Acceso denegado");
    }
}
