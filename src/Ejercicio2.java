/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;


/**
 *
 * @author anasa
 */
public class Ejercicio2 {
    
    public static double calculoArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
    
    public static double calculoLongitud(double r){
        return 2* Math.PI * r;
    } 
    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner (System.in);
        System.out.println("Introduce el radio del circulo: ");
        double radio= leer.nextDouble();
      
        //Area
        System.out.println("\nEl area es: " + calculoArea(radio));
        //Longitud
        System.out.println("La longitud es: "+ calculoLongitud(radio));
    }
    
    
    
}
