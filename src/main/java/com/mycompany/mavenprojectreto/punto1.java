/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenprojectreto;

/**
 *
 * @author user
 */
import java.util.Scanner; 
public class punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // Escribe un programa en Java que calcule la suma de todos los numeros que son multiplos de 3 o 5 y que sean menores que un numero dado N.
      //Ademas, excluye aquellos numeros que son multiplos de ambos  3 y 5. 
      //Por ejemplo, si N es 10, los multiplos de 3 o 5 menores que 10 son 3,5,6 y 9 y la suma seria 23 
      
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero que desee:"+"");
        int N = scanner.nextInt(); 
        int suma = 0;
        for (int i = 1; i < N; i++) {
            if ((i % 3 == 0 && i % 5 != 0) || (i % 5 == 0 && i % 3 != 0)) {
                suma += i;
            }
        
        System.out.println("La suma de los múltiplos de 3 o 5 (No es de ambos numeros el primero corresponde a 3 y el segundo a 5) menores que " + N + " es: " + suma);
    }
}

        
    }
    

