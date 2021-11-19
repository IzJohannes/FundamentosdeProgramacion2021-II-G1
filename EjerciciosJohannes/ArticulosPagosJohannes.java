package Ejercicios;
import java.util.Random;
import java.util.Scanner;
public class ArticulosPagosJohannes {
    //ejercicio 4.9
    static Scanner teclado = new Scanner(System.in); 
    public static void main(String[] args) {
//ejercicio 4.8
    //Daclarar Variables
    double montoPagarArt=0, montoPagarT=0, precio, descuento;
    int cantArt1=0, cantArt2=0, cantArt3=0;
    double CantArticulo;
    //datos de Entrada
    System.out.print("Ingrese N cantidad de articulos: ");
    CantArticulo=teclado.nextInt();
    Random precioAleatorio = new Random();
    //Proceso
    for (int art=1; art<=CantArticulo; art++) {
        System.out.println("");
        precio = precioAleatorio.nextInt(300-1); //el precio maximo es solo un spuesto
        System.out.println("El precio del articulo es: "+precio);
        if (precio>200) {cantArt1++;} 
        if (precio<200) if (precio>100) {cantArt2++;} 
        if (precio<=100) {cantArt3++;}
        
        
        if (precio>200) {
            montoPagarArt=precio-(precio*0.15);
            descuento=precio*0.15;
            System.out.println("El  monto a pagar del articulo es "+montoPagarArt+ " y su descuento es "+descuento);}
            
        if (precio<200) if (precio>100) {
            montoPagarArt=precio-(precio*0.12);
            descuento=precio*0.12;
            System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento);}
            
        if (precio<=100) {
            montoPagarArt=precio-(precio*0.10);
            descuento=precio*0.10;
            System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento); }  
    montoPagarT= montoPagarT+montoPagarArt;
    }
    //datos de salida
    System.out.println("\nDel total de articulos:\n"+cantArt1+" es/son de precio mayor a 200 soles"+
    "\n"+cantArt2+" es/son de precio entre 200 y 100 soles"+
    "\n"+cantArt3+" es/son de precio menores o iguaes a 100 soles"
    );
    System.out.println("\nEl precio total de todos los articulos es: "+montoPagarT+" soles");
    }
    

}