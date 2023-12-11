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
public class punto3 {

    
    public static void main(String[] args) {
     /*
        Escribe un programa que sea capaz de generar contraseñas de forma aleatoria. Podras 
        configurar generar contraseñas con los siguientes parametros : 
        - Longitud: entre 8 y 16 
        - Con o sin letras mayusculas 
        - Con o sin numeros 
        - Con o sin simbolos 
        (Pudiendo combinar todos estos parametros entre ellos)
        */
        
        String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuwxyz"; 
        String simbolos = "!@#$%&*"; 
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud de la contraseña (entre 8 y 16): ");
        int length = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("¿Quieres letras mayúsculas? (s/n): ");
        boolean useUppercase = scanner.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Quieres números? (s/n): ");
        boolean useNumbers = scanner.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Quieres símbolos? (s/n): ");
        boolean useSymbols = scanner.nextLine().equalsIgnoreCase("s");

        //String password = generatePassword(length, useUppercase, useNumbers, useSymbols);
        //System.out.println("Tu contraseña es: " + password);

        //NO SE COMO HACERLO :D
         
 
    }
    
}
