package Ejercicios;

import java.util.Scanner; 
public class CuboJohannes{ 
    static Scanner teclado = new Scanner(System.in);  
   //ejercicio 4.16
    public static void main(String[] args) {
        //varibles 
        int numero=0, resultado=0;
        do {
            System.out.println("ingrese el numero:");
            numero=(int) teclado.nextDouble();
            resultado=(int)Math.pow(numero, 3);
            System.out.println("el cubo del numero "+numero+" es: "+resultado);
        } while (numero>0);

    }
}   