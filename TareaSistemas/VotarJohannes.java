import java.util.Scanner;

public class VotarJohannes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextInt();
        in.nextLine();
        if(edad>=18)
            System.out.println("S\u00ED puede votar en las pr\u00F3ximas elecciones.");
        else
            System.out.println("No puede votar en las pr\u00F3ximas elecciones.");
    }

}
