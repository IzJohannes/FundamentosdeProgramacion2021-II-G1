import java.util.Scanner;
class ExamenProgramacion{ 
static Scanner sc = new Scanner(System.in);

static void bono(){
    double bono, puntos, S_minimo;
    System.out.print("Ingresa el valor de puntos: ");
    puntos = sc.nextDouble();
    sc.nextLine();
    System.out.print("Ingresa el valor de salario minimo: ");
    S_minimo = sc.nextDouble();
    sc.nextLine();
    bono=0;
    if(puntos>=100&&puntos>200)
        bono=S_minimo*0.10;
    if(puntos>=201&&puntos<=300)
        bono=S_minimo*0.40;
    if(puntos>=301&&puntos<=400)
        bono=S_minimo*0.70;
    if(puntos>=401)
        bono=S_minimo*0.80;
    System.out.println("Valor de bono: " + bono);
}
static void OPbasicas(){ 
  int resultado=0;
  System.out.println("INGRESE EL PRIMER NUMERO");
  int numero1=sc.nextInt();
  System.out.println("INGRESE EL SEGUNDO NUMERO");
  int numero2=sc.nextInt();
  System.out.println("OPERACIONES BASICAS");
  int operacion=sc.nextInt();
  switch(operacion){
     case 1: resultado=numero1+numero2;
     System.out.println("la suma es:"+resultado);
     break;
     case 2: resultado=numero1-numero2;
     System.out.println("la resta es:"+resultado);
     break;
     case 3: resultado=numero1*numero2;
     System.out.println("la multiplicacion es:"+resultado);
     break;
     case 4: resultado=numero1/numero2;
     System.out.println("la division es:"+resultado);
     break;
     default:
      System.out.println("LA OPERACION NO EXISTE");
      break;

   }


}
static void Vacuna(){
  
    int edad, sexo;
    System.out.print("Ingresa el valor de edad: ");
    edad = sc.nextInt();
    sc.nextLine();
    System.out.println("Selecciona el valor de sexo.");
    System.out.println("\t1.- mujer");
    System.out.println("\t2.- hombre");
    System.out.print("\t: ");
    do {
        sexo = sc.nextInt();
        sc.nextLine();
        if (sexo<1||sexo>2)
            System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
    } while (sexo<1||sexo>2);
    if((sexo==2&&edad>=16&&edad<70)||edad<16)
        System.out.println("A");
    if(sexo==1&&edad>=16&&edad<70)
        System.out.println("B");
    if(edad>70)
        System.out.println("C");
        System.out.println("\t Ingrese nuevo Codigo");

        return;
 }

  




static void Nota(){ 
    
    double nota1=0, nota2=0, nota3=0;
    double promedio=0;
    
System.out.println("ingrese las notas del estudiante: ");
    
System.out.print("ingrese la nota 1: ");
nota1 = sc.nextDouble();
System.out.print("ingrese la nota 2: ");
nota2 = sc.nextDouble();
System.out.print("ingrese la nota 3: ");
nota3 = sc.nextDouble();
    
  promedio = (nota1 * 0.25 + nota2 * 0.25 + nota3 * 0.50)/3;
    if(promedio >=11){
      System.out.println("el alumno aprovo: " + promedio); 
    }else {
      System.out.println("el alumno reprovo: " + promedio); 
    }
}
static void menuOpciones(){ 
    int opcionesA=0;
    String msg="\n   Examen de Programacion escoger pregunta ";
    System.out.println(msg);
    String msg1= "Pregunta de bono (1)";
    System.out.println(msg1);
    String msg2= "Pregunta de nota (2)";
    System.out.println(msg2);
    String msg3= "Pregunta tipos de vacuna (3)";
    System.out.println(msg3);
    String msg4= "Pregunta Operaciones aritmeticas  (4)"; 
    System.out.println(msg4);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
          case 1:bono();break;
          case 2:Nota();break;
          case 3:Vacuna();break;
          case 4:OPbasicas();break;
        
          default:
          System.out.println("El Algoritmo no existe!");
        }
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }       


    public static void main(String[] args) {
    menuOpciones();
  }
}
