/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package github.aplicacion;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Aplicacion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + ", Bienvenido a la Calculadora:");

        System.out.println("Dime el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo número: (No puede ser 0, dara Error.)");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma);
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
        int multiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        int mod = num1 % num2;
        System.out.println("El resultado de la modulación es: " + mod);
            int division = num1 / num2;
            System.out.println("El resultado de la división es: " + division);
    }
}
