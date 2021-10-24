package Ejercicios;

import java.util.Scanner;

public class NaufragoJohannes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int forma_de_pago, i, n, tipo_de_hamburguesa;
        double cargo, costo, pago;
        pago = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.println("Selecciona el valor de tipo de hamburguesa.");
            System.out.println("\t1.- S sencilla");
            System.out.println("\t2.- D doble");
            System.out.println("\t3.- T triples");
            System.out.print("\t: ");
            do {
                tipo_de_hamburguesa = in.nextInt();
                in.nextLine();
                if (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (tipo_de_hamburguesa<1||tipo_de_hamburguesa>3);
            costo=0;
            if(tipo_de_hamburguesa==1)
                costo=10000;
            if(tipo_de_hamburguesa==2)
                costo=15000;
            if(tipo_de_hamburguesa==3)
                costo=28000;
            System.out.println("Selecciona el valor de forma de pago.");
            System.out.println("\t1.- Efectivo");
            System.out.println("\t2.- Tarjeta");
            System.out.print("\t: ");
            do {
                forma_de_pago = in.nextInt();
                in.nextLine();
                if (forma_de_pago<1||forma_de_pago>2)
                    System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
            } while (forma_de_pago<1||forma_de_pago>2);
            if(forma_de_pago==1)
                cargo=0;
            else
                cargo=costo*0.05;
            pago=pago+costo+cargo;
            System.out.println("Valor de cargo: " + cargo);
            System.out.println("Valor de costo: " + costo);
            System.out.println();
        }
        System.out.println("Valor de pago: " + pago);
    }

}