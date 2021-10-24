package Ejercicios;

import java.util.Scanner;
public class MultiplicacionJohannes  {
    //ejercicio 4.17
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
    System.out.println("Tabla de multiplicación");
    //variables
    int n, multiplicador;
    //datos de entrada 
    System.out.print("\ningrese el numero entero positivo a multiplicar: ");
    n = teclado.nextInt();
    System.out.print("ingrese el limite de tu multiplicador: ");
    multiplicador=teclado.nextInt();  
    if (n>0) {
        for (int i=1; i<=multiplicador; i++){
            System.out.println(n+"x"+i+" = "+n*i);
        }
    } else {
        System.out.println("el numero que ingreso es invalido" ); 
    }
    System.out.println("buena suerte en la tabla de multiplicacion");
    }
}