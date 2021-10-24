package Ejercicios;
import java.util.Scanner;
public class PersonaJohannes {
    //ejercicio 4.5
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
            //variables
            double ahorrodiario;
            //datos de entrada;
            double ahorro1deenero=3;
            //unañotiene365dias;
            for (int dia=1; dia<=365; dia++){
                System.out.println("el ahorro en el");
                ahorrodiario=Math.pow(ahorro1deenero, dia);
                System.out.println("dia "+dia+" es "+ahorrodiario+" pesos");
    
    
            }
        
    }
}