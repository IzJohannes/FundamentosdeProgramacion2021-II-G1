
import java.util.Scanner;

public class tres_REgalo_GFYM{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int presupuesto;
        System.out.print("Ingresa el valor de presupuesto: ");
        presupuesto = in.nextInt();
        in.nextLine();
        if(presupuesto<=10)
            System.out.println("Tarjeta");
        if(presupuesto>=11&&presupuesto<=100)
            System.out.println("Chocolates");
        if(presupuesto>=101&&presupuesto<=250)
            System.out.println("Flores");
        if(presupuesto>=251)
            System.out.println("Anillo");
    }

}