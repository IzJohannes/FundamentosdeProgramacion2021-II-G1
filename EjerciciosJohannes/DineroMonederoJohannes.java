package Ejercicios;

import java.util.Scanner;

public class DineroMonederoJohannes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int billetes_de_cincuenta, billetes_de_diez, billetes_de_veinte, cantidad_de_dinero, monedas_de_cinco;
        int monedas_de_diez, monedas_de_un_peso;
        System.out.print("Ingresa el valor de billetes de cincuenta: ");
        billetes_de_cincuenta = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de diez: ");
        billetes_de_diez = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de veinte: ");
        billetes_de_veinte = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de cinco: ");
        monedas_de_cinco = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de diez: ");
        monedas_de_diez = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de un peso: ");
        monedas_de_un_peso = in.nextInt();
        in.nextLine();
        cantidad_de_dinero=monedas_de_diez*10+monedas_de_cinco*5+monedas_de_un_peso+billetes_de_diez*10+billetes_de_veinte*20+billetes_de_cincuenta*50;
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
    }

}