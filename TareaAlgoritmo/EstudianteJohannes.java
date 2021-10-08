import java.util.Scanner;

public class EstudianteJohannes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bono, puntos, salario_minimo;
        System.out.print("Ingresa el valor de puntos: ");
        puntos = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de salario minimo: ");
        salario_minimo = in.nextDouble();
        in.nextLine();
        bono=0;
        if(puntos<=100)
            bono=salario_minimo;
        if(puntos>100&&puntos<=150)
            bono=salario_minimo*2;
        if(puntos>150)
            bono=salario_minimo*3;
        System.out.println("Valor de bono: " + bono);
        in.close();
    }

}