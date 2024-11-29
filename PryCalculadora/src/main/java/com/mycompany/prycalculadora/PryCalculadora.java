package com.mycompany.prycalculadora;

import java.util.Scanner;
/**
 *
 * @author jhair
 */
// crear clase Operaciones
class Operaciones {
    // atributos
    private double numero1;
    private double numero2;

    // getters y setters
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    // metodo suma
    public double sumar() {
        return numero1 + numero2;
    }

    // metodo resta
    public double restar() {
        return numero1 - numero2;
    }

    // metodo multiplicar
    public double multiplicar() {
        return numero1 * numero2;
    }

    // metodo dividir
    public double dividir() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } 
        else {
            System.out.println("error: division entre cero no permitida.");
            return Double.NaN;
        }
    }
}

// clase principal calculadora
public class PryCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();

        // solicitar numeros al usuario
        System.out.print("Ingresa el 1er numero: ");
        operaciones.setNumero1(scanner.nextDouble());

        System.out.print("Ingresa el 2do numero: ");
        operaciones.setNumero2(scanner.nextDouble());

        // mostrar resultados de las operaciones
        System.out.println("\nResultados:");
        System.out.println("1er numero: " + operaciones.getNumero1());
        System.out.println("2do numero: " + operaciones.getNumero2());
        System.out.println("Suma: " + operaciones.sumar());
        System.out.println("Resta: " + operaciones.restar());
        System.out.println("Multiplicacion: " + operaciones.multiplicar());
        System.out.println("Division: " + operaciones.dividir());

        scanner.close();
    }
}
