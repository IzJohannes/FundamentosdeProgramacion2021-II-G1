package Ejercicios;
import java.util.Scanner;
public class AprovadosJohannes {
    //ejercicio 4.5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aprobados, i, n, reprobados;
        double calificacion, calificacion_aprobatoria;
        aprobados = 0;
        reprobados = 0;
        System.out.print("Ingrese la Calificacion Aprovatoria : ");
        calificacion_aprobatoria = in.nextDouble();
        in.nextLine();
        System.out.print("Ingrese la cantidad de alumnos : ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.println();
            System.out.print("alumno " + i);
            System.out.print("   ingrese la calificacion : ");
            calificacion = in.nextDouble();
            in.nextLine();
            if(calificacion>=calificacion_aprobatoria)
                aprobados=aprobados+1;
            else
                reprobados=reprobados+1;
            System.out.println();
        }
        System.out.println("Valor de aprobados: " + aprobados);
        System.out.println("Valor de reprobados: " + reprobados);
    }

}