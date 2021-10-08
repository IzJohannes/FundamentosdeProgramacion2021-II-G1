import java.util.Scanner;
public class DiasdelasemanaJohannes{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Número del 1 - 7 : ");
        num = Integer.parseInt(sc.next());
        switch(num){
            case 1: System.out.println(" El dia de la semana es: LUNES"); break;
            case 2: System.out.println("El dia de la semana es: MARTES"); break;
            case 3: System.out.println("El dia de la semana es: MIERCOLES"); break;
            case 4: System.out.println("El dia de la semana es: JUEVES"); break;
            case 5: System.out.println("El dia de la semana es: VIERNES"); break;
            case 6: System.out.println("El dia de la semana es: SABADO"); break;
            case 7: System.out.println("El dia de la semana es: DOMINGO"); break;
            default : System.out.println(" CODIGO INCORRECTO");
            sc.close();
        }
    }
}