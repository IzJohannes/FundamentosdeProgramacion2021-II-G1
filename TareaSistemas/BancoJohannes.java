import java.util.Scanner;

public class BancoJohannes{

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double compras_realizadas, intereses, multa, pago_del_corte_anterior, pago_minimo;
      double pago_para_no_generar_intereses, saldo_actual, saldo_anterior;
      System.out.print("Ingresa el valor de compras realizadas: ");
      compras_realizadas = in.nextDouble();
      in.nextLine();
      System.out.print("Ingresa el valor de pago del corte anterior: ");
      pago_del_corte_anterior = in.nextDouble();
      in.nextLine();
      System.out.print("Ingresa el valor de saldo anterior: ");
      saldo_anterior = in.nextDouble();
      in.nextLine();
      if(saldo_anterior*0.15>pago_del_corte_anterior)
        { 
            intereses=saldo_anterior*0.12;
            multa=200;
        }
      else
        {
            intereses=0;
            multa=0;
        }
      saldo_actual=saldo_anterior+compras_realizadas-pago_del_corte_anterior+intereses+multa;
      pago_minimo=saldo_actual*0.15;
      pago_para_no_generar_intereses=saldo_actual*0.85;
      System.out.println("Valor de intereses: " + intereses);
      System.out.println("Valor de multa: " + multa);
      System.out.println("Valor de pago minimo: " + pago_minimo);
      System.out.println("Valor de pago para no generar intereses: " + pago_para_no_generar_intereses);
      System.out.println("Valor de saldo actual: " + saldo_actual);
      in.close();
    }

}