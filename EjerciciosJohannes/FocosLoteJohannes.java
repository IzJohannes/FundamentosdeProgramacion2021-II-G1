package Ejercicios;
import java.util.Scanner;
public class FocosLoteJohannes  {
    static Scanner teclado = new Scanner(System.in);
    //ejercicio 4.4 
    public static void main(String[] args) {
        //definir Variables
        int NFocos, FVerde=0, FBlanco=0, FRojo=0;
        //Datos de entrada
        System.out.println("Ingrese N cantidad de Focos de colores:");
        NFocos=teclado.nextInt();
        //Proceso
        for (int foco = 1; foco <= NFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo) "+
            "del color de foco y numero "+foco+":");
            String color=teclado.next();
            if(color.toUpperCase().equals("V")){ FVerde++; }
            if(color.toUpperCase().equals("B")){ FBlanco++; }
            if(color.toUpperCase().equals("R")){ FRojo++; }
           
        }
        //Datos de salida
        System.out.println("Del cantidad de focos:\n"+FVerde+" son Verde(s)\n"+
        FBlanco+" son Blanco(s)\n"+FRojo+" son Rojo(s)\nEn  cantidad total son:"+NFocos);
    } 
}   