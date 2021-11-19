package Ejercicios;

import java.util.Scanner;
public class BancoJohannes {
    //ejercicio 4.9
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
        //variables
        double Dmensual, IfijoAnual, monto=0, capAnual=0;
        int meses, Naños;
        //datos de entrada
        System.out.print("Ingrese el deposito mensual: ");
        Dmensual=teclado.nextDouble();
        System.out.print("ingrese el año limite de su inversion: ");
        Naños=teclado.nextInt();
        IfijoAnual=0.10;
        meses=12;
        for (int año = 1; año <= Naños; año++) {
            capAnual = monto + (capAnual+Dmensual*meses);
            monto = capAnual + (capAnual*IfijoAnual);
            System.out.println("\nEl  capital total del año "+año+ " es: "+capAnual+
            " \ny su monto (capital + interes que recibe) es: "+monto);   
        }   
    }   
}