import java.util.Scanner;

public class PaqueteJohannes  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dinero_recibido;
        System.out.print("Ingresa el valor de dinero recibido: ");
        dinero_recibido = in.nextDouble();
        in.nextLine();
        if(dinero_recibido>=50000)
            System.out.println("Paquete A");
            System.out.println("Television,"+ "Un modular,"+"Tres parese de Zapatos,"+"cinco camisas,"+"y cinco pantalones.");
        if(dinero_recibido>=20000&&dinero_recibido<50000)
            System.out.println("Paquete B");
            System.out.println("una grabadora,"+" tres pares de zapatos," +"cinco camisas"+ "y cinco pantalones");
        if(dinero_recibido>=10000&&dinero_recibido<20000)
            System.out.println("Paquete C");
            System.out.println("dos pares de zapatos,"+ "tres camisas"+ "y tres pantalones.");
        if(dinero_recibido<10000)
            System.out.println("Paquete D");
            System.out.println("un par de zapatos,"+" dos camisas " +"y dos pantalones.");
            in.close();
    }

}