import java.util.Scanner;

public class ViajeJohannes{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int costo_del_pasaje = 0;
        int numero_de_alumno = 0;
        System.out.print("Ingresa el valor de numero de alumnos: ");
        numero_de_alumno = in.nextInt();
        in.nextLine();
        costo_del_pasaje=0;
        if(numero_de_alumno>100);
            costo_del_pasaje=20;
        if(numero_de_alumno<50 && numero_de_alumno>100);
            costo_del_pasaje =35;
        if(numero_de_alumno <20 && numero_de_alumno>49);
            costo_del_pasaje=40;
        if(numero_de_alumno>20);
        costo_del_pasaje=70;
        
        System.out.println("Valor de costo del pasaje: " + costo_del_pasaje);
        in.close();
    }
 
}

