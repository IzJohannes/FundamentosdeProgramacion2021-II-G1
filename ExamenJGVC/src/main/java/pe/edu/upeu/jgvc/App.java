package pe.edu.upeu.jgvc;
import pe.edu.upeu.jgvc.util.*;
import pe.edu.upeu.jgvc.examen.*;
public class App{
  static LeerTeclado pou2 = new LeerTeclado();
  
  static ResolucionExamen ali = new ResolucionExamen();
  
  static void MenudePreguntasdeExamen(){

    int p=pou2.leer(0,"\nPreguntasdeExamen:"+"\nAlgoritmo 2 : 1"+"\nAlgoritmo 3 : 2"+
        "\nAlgoritmo 4 : 3"+"\nAlgoritmo 5 : 4"+"\nSimbolo de cierre: 0"+"\nElija el Algoritmo");
        
    while(p!=0){
            switch(p){
            case 1: ali.CompañiaAutomotriz();break;

            case 2: ali.TabladeMultiplicaral20();break;
                        
            case 3: ali.NumerosPerfectos();break;

            case 4: int a=pou2.leer(0,"Introdusca el primer valor");
              int s=pou2.leer(0,"Introdusca el segundo valor");
    System.out.println("El resultado es: "+ali.Potenciacion(a, s));break;
                        
            default: System.out.println("Error");   
}
  System.out.println("--------------------------");
  p=pou2.leer(0,"\nPreguntasdeExamen:"+"\nAlgoritmo 2 : 1"+"\nAlgoritmo 3 : 2"+
  "\nAlgoritmo 4 : 3"+"\nAlgoritmo 5 : 4"+"\nSimbolo de cierre: c"+"\nElija el Algoritmo");
}

        }
public static void main( String[] args ){

System.out.println( "Bienvenido al Sistema de Menu de Opciones" );
       MenudePreguntasdeExamen();
       
    }

    
}