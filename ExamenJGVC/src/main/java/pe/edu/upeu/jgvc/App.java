package pe.edu.upeu.jgvc;
import pe.edu.upeu.jgvc.util.LeerTeclado;
import pe.edu.upeu.jgvc.examen.ResolucionExamen;

public class App{
  static LeerTeclado cd = new LeerTeclado();
  static ResolucionExamen pou = new ResolucionExamen();
    public static void main( String[] args ){
     pou.impuestoAutos();
    }
}
