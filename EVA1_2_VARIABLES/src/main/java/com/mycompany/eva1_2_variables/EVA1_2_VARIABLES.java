/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_2_variables;

/**
 *
 * @author DOWER
 */
public class EVA1_2_VARIABLES {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO!!"); //Cadena de texto
        System.out.println(100);            //Un numero entero
        System.out.println('c');            //Un caracter
        System.out.println(true);           //Valores logicos
        System.out.println(false);
        System.out.println(1000.52);        //Numeros con fraccion (con puntos flotantes)

        //TIPOS DE DATOS
        //Enteros
        /*
        long
        int
        short
        byte
         */
        //Decimales
        /*
        double
        float
         */
        //Texto
        /*
        String
         */
        //Caracter
        /*
        char
         */
        //Logicos (true false)
        /*
        boolean
         */
        //Creacion y uso de una variable
        int edad;       //Declaro una variable de tipo entero llamada edad
        //double edad; No podemos tener dos variables con el mismo nombre
        String nombre;
        String apellido;
        double promedio;
        
        edad = 18;
        
        System.out.println(edad);       //println tambien imprime variables (el contenido)
        nombre = "Andres";
        
        System.out.println(nombre);
        apellido = "Campos";
        
        System.out.println(apellido);
        promedio = 80.4;
        
        System.out.println(promedio);
    }
}
