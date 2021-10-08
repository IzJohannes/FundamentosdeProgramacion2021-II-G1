import java.util.Scanner;

public class PantalonesJohannes{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modelo, talla;
        double N_pantalones, cargo_por_talla, costo_de_la_tela, ganancia, ganancia_extra;
        double mano_de_obra, metro_de_tela, metros_de_tela, precio_final;
        System.out.print("Ingresa el valor de N pantalones: ");
        N_pantalones = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de metro de tela: ");
        metro_de_tela = in.nextDouble();
        in.nextLine();
        System.out.println("Selecciona el valor de modelo.");
        System.out.println("\t1.- A");
        System.out.println("\t2.- B");
        System.out.print("\t: ");
        do {
            modelo = in.nextInt();
            in.nextLine();
            if (modelo<1||modelo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (modelo<1||modelo>2);
        System.out.println("Selecciona el valor de talla.");
        System.out.println("\t1.- 30");
        System.out.println("\t2.- 32");
        System.out.println("\t3.- 36");
        System.out.print("\t: ");
        do {
            talla = in.nextInt();
            in.nextLine();
            if (talla<1||talla>3)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (talla<1||talla>3);
        if(modelo==1)
            metros_de_tela=1.5*N_pantalones;
        else
            metros_de_tela=1.8*N_pantalones;
        costo_de_la_tela=metros_de_tela*metro_de_tela;
        if(modelo==1)
            mano_de_obra=costo_de_la_tela*0.8;
        else
            mano_de_obra=costo_de_la_tela*0.95;
        if(talla==2||talla==3)
            cargo_por_talla=mano_de_obra*0.04;
        else
            cargo_por_talla=0;
        ganancia_extra=(costo_de_la_tela+mano_de_obra+cargo_por_talla)*0.3;
        precio_final=costo_de_la_tela+mano_de_obra+cargo_por_talla+ganancia_extra;
        ganancia=cargo_por_talla+ganancia_extra;
        System.out.println("Valor de cargo por talla: " + cargo_por_talla);
        System.out.println("Valor de costo de la tela: " + costo_de_la_tela);
        System.out.println("Valor de ganancia: " + ganancia);
        System.out.println("Valor de ganancia extra: " + ganancia_extra);
        System.out.println("Valor de mano de obra: " + mano_de_obra);
        System.out.println("Valor de metros de tela: " + metros_de_tela);
        System.out.println("Valor de precio final: " + precio_final);
        in.close();
    }

}