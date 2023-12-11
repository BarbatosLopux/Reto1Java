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

public class punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu contraseña: ");
        String password = scanner.nextLine();
        
        if (validarPassword(password)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }

    public static boolean validarPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean mayuscula = false;
        boolean minuscula = false; 
        boolean numeros = false; 
        boolean especial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numeros = true;
            } else if ("!@#$%&*".indexOf(c) != -1) {
                especial = true;
            }
        }

        return mayuscula && minuscula && numeros && especial;
    }
}