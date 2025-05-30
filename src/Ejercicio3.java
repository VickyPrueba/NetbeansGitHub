/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;



/**
 *
 * @author anasa
 */
public class Ejercicio3 {
    
     public static void ordenarNumeros(int num1, int num2, int num3, int num4) {
        // Ordenar los números utilizando comparaciones simples
        if (num1 > num2) { int temp = num1; num1 = num2; num2 = temp; }
        if (num1 > num3) { int temp = num1; num1 = num3; num3 = temp; }
        if (num1 > num4) { int temp = num1; num1 = num4; num4 = temp; }

        if (num2 > num3) { int temp = num2; num2 = num3; num3 = temp; }
        if (num2 > num4) { int temp = num2; num2 = num4; num4 = temp; }

        if (num3 > num4) { int temp = num3; num3 = num4; num4 = temp; }

        // Imprimir los números ordenados
        System.out.println("Los numeros ordenados son: " + num1 + ", " + num2 + ", " + num3 + " y " + num4);
    }

    
    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero1= leer.nextInt();
        System.out.println("Introduce otro numero:");
        int numero2= leer.nextInt();
        System.out.println("Introduce un numero:");
        int numero3= leer.nextInt();
        System.out.println("Introduce otro numero:");
        int numero4= leer.nextInt();
        
        
        ordenarNumeros(numero1, numero2,numero3,numero4);
        
        
        
    }
    
 
    
}
