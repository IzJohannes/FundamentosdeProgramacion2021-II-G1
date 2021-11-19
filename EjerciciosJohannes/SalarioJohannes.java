package Ejercicios;
import java.util.Scanner;
public class SalarioJohannes {

    public static void main(String[] args) {
        int i;
        double salario_inicial, salario_recibido, year;
        for (i=1; i<=6; i++) {
            System.out.print("PROCESO " + i);
            salario_inicial=1500;
            year=i;
            salario_recibido=salario_inicial*Math.pow(1.1,year);
            System.out.println("Valor de salario inicial: " + salario_inicial);
            System.out.println("Valor de salario recibido: " + salario_recibido);
            System.out.println("Valor de year: " + year);
            System.out.println();
        }
    }

}
