import java.util.Scanner

public class Descuento {
  
  public static void Descuento(String[] args) {
      scanner in = new Scanner(System.in);
      double costo, descuento, precio;
      System.out.print("Ingrese el valor de precio:");
      precio = in.nextDouble();
      in.nextline();
      descuento=0;
      if(precio>=200)
          descuento=precio*0.15;
      if(precio>100&&precio<200)
          descuento=precio*0.12;
      if(precio<100)
        descuento=precio*0.1;
      costo de precio-descuento
      System.out.println("Valor de costo: " + costo);
      System.out.println("Valor de descuento: " + descuento);

    
  }  
  
}