/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenprojectreto;

/**
 *
 * @author user
 */
public class punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        El codigo que genera en python parece ser  la secuencia de Fibonacci y muestra sus primeros numeros. 
        - a, b = 0,1 inicializa las dos primeras variables, a y b, con los dos primeros números de la secuencia de Fibonacci.
        - for _ in range(10): es un bucle que se ejecuta 10 veces.
        - print(a,end="") imprime el valor actual de a (el número actual en la secuencia de Fibonacci) y luego no pasa a la siguiente línea debido al argumento `end=""`.
        - a, b = b, a + b es una asignación múltiple que hace dos cosas:
        - Asigna el valor de b (el siguiente número en la secuencia) a a.
        - Calcula el próximo número en la secuencia (a + b) y lo asigna a b.
     
        Por lo tanto, este programa imprimirá los primeros números de la secuencia de Fibonacci en una sola línea. Por ejemplo, la salida será `0112358132134`.
        */
        int a = 0, b = 1; 
        for (int i = 0; i < 10; i++){
            System.out.print(a);
            int nombreDeVariableGenerica = a; 
            a = b; 
            b = nombreDeVariableGenerica + b; // xD       
        }
        System.out.println();
             
    }
    
}
