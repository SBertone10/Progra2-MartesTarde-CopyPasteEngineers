import Implementacion.Cola;
import Interface.ColaTDA;

public class ej5 {
//Fila buffet facultda
   static void main(String[] args) {

        ColaTDA fila = new Cola();
        fila.InicializarCola();

        System.out.println("=== se forma la fila para el sanguchito ===");
        fila.Acolar(1); System.out.println("Alumno 1 se forma correctamente");
        fila.Acolar(2); System.out.println("Alumno 2 se forma correctamente");
        fila.Acolar(3); System.out.println("Alumno 3 intenta colarse pero Acolar() lo manda al final igual");
        fila.Acolar(4); System.out.println("Alumno 4 se forma correctamente");

        System.out.println("\n=== Orden de atención en el buffet ===");
        int orden = 1;
        while (!fila.ColaVacia()) {
            System.out.println(orden + ". Le toca al alumno " + fila.Primero());
            fila.Desacolar();
            orden++;
        }
    }
}