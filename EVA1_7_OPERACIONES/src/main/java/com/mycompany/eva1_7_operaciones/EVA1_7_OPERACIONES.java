/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author DOWER
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
        int x = 10;     //declaramos y asignamos
        int y = 5;
        //declaracion de multiples variables del mismo tipo
        int suma, resta, multi, divi;
        double pot, raiz;
        //Suma Y Resta
        suma = x + y;
        System.out.println("La Suma de x + y: ");
        System.out.println(suma);
        
        //Resta
        resta = x - y;      //operador de diferencia -
        System.out.println("la Resta de x- y: ");
        System.out.println(resta);
        
        //Multiplicacion
        multi = x * y;
        System.out.println("la Multiplicacion de x * y: ");
        System.out.println(multi);
        
        //Divicion
        //si divimos enteros, java da como como resultado a numero entero
        divi = x / y;
        System.out.println("la Divicion de x(10) / y(5): ");
        System.out.println(divi);
        // cambiamos los valores de x y 
        x = 5;
        y = 2;
        divi = x / y;
        System.out.println("la Divicion de x(5) / y(2): ");
        System.out.println(divi);
        
        double val1 = 5, val2 = 2;
        double diviD = val1 / val2;
        System.out.println("la Divicion de x(5) / y(2): ");
        System.out.println(diviD);
        
        //Potencias
        pot = x * x;
        System.out.println("La potencia de x elevado a 2: ");
        System.out.println(pot);
        
        pot = y * y;
        System.out.println("La potencia de y elevado a 2: ");
        System.out.println(pot);
        
        pot = Math.pow(x , y);
        System.out.println("La potencia de x elevado a y: ");
        System.out.println(pot);
        
        //Raiz
        raiz = Math.sqrt(x);
        System.out.println("La raiz de x es: ");
        System.out.println(raiz);
        
        raiz = Math.sqrt(y);
        System.out.println("La raiz de y es: ");
        System.out.println(raiz);
    }
}
