import java.util.Scanner;

public class EstacionamientoJohannes{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cobro, horas;
        System.out.print("Ingresa el valor de horas: ");
        horas = in.nextInt();
        in.nextLine();
        cobro=0;
        if(horas<=2)
            cobro=horas*5;
        if(horas>2&&horas<=5)
            cobro=2*5+(horas-2)*4;
        if(horas>5&&horas<=10)
            cobro=2*5+3*4+(horas-5)*3;
        if(horas>10)
            cobro=2*5+3*4+3*5+(horas-10)*2;
        System.out.println("Valor de cobro: " + cobro);
    }

}